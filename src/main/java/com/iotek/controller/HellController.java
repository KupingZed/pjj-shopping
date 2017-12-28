package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * Created by 15311 on 2017/12/25.
 */
/*@Controller
public class HellController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(HashMap<String,Object> hashMap){
        hashMap.put("name","pan");
        hashMap.put("age",22);
        //返回的结果是一个数据或者视图的名字
        return "index";
    }
    *//*@RequestMapping(value = "/customer.info",method = RequestMethod.GET)
    public ModelAndView getCustomer(ModelAndView modelAndView){
        Customer customer=new Customer();
        customer.setCustomerName("pan");
        customer.setCustomerPassword("12345678");
        customer=customerService.query(customer);
        if (customer == null) {
            modelAndView.addObject("info","用户不存在");
            modelAndView.setViewName("error");
            return modelAndView;
        }
        modelAndView.addObject("customer",customer);
        modelAndView.setViewName("success");
        return modelAndView;
    }*//*
    @RequestMapping(value = "/customer.info",method = RequestMethod.GET)
    public String getCustomer(Model model, HttpSession httpSession){
        Customer customer=new Customer();
        customer.setCustomerName("pan");
        customer.setCustomerPassword("12345678");
        customer = customerService.query(customer);
        if (customer == null) {
            model.addAttribute("info","用户不存在");
            return "error";
        }
        httpSession.setAttribute("customer",customer);
        return "success";
    }
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String info(){
        return "info";
    }
}*/
