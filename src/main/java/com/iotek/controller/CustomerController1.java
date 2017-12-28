package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by 15311 on 2017/12/26.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController1 {
    @Autowired
   CustomerService customerService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@ModelAttribute Customer customer, @RequestParam(required=false) String remember, HttpSession httpSession, HttpServletResponse response){
        customer= customerService.query(customer);
        if (customer == null) {
           httpSession.setAttribute("info","登录失败");
            return "redirect:/customer/index";
        }
        if (remember != null) {
            Cookie cookieName=new Cookie("customerName",customer.getCustomerName());
            Cookie cookiePassword=new Cookie("customerPassword",customer.getCustomerPassword());
            cookieName.setMaxAge(1*60*60*24*7);
//            cookie  需要加setPath才能保存
            cookieName.setPath("/");
            cookiePassword.setMaxAge(1*60*60*24);
            cookiePassword.setPath("/");
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);
            System.out.println(remember);
        }
        httpSession.setAttribute("customer",customer);
        return  "customerIndex";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/register.view",method = RequestMethod.GET)
    public String getRegisterView(){
        return "register";
    }
    @RequestMapping(value = "/customerCheckEmail/{customerEmail}",method = RequestMethod.GET)
    public @ResponseBody String customerCheckEmail(@PathVariable  String customerEmail) {
        System.out.println(customerEmail);
        return "is_exist";
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@ModelAttribute Customer customer,HttpSession httpSession){
        boolean add = customerService.add(customer);
        if (add) {
            httpSession.setAttribute("info","注册成功");
            //去登录
            return "redirect:/customer/index";
        }
        httpSession.setAttribute("info","注册失败，请重新注册");
        return "redirect:/customer/register.view";
    }

}
