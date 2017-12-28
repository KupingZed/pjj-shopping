package com.iotek.test;


import com.iotek.po.*;
import com.iotek.service.*;
import com.iotek.service.impl.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by 15311 on 2017/12/13.
 */
public class Test {
    public static void main(String[] args) {
        //注册用户
       /* ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
        CustomerService customerService= (CustomerService) context.getBean("customerService");
        Customer customer=new Customer();
        customer.setCustomerName("王五");
        customer.setCustomerPassword("1234567");
        customer.setCustomerEmail("1234567@qq.com");
        customer.setCustomerPhone("123456789654");
        customerService.registerCustomer(customer);*/
        /*通过id查询用户*/
       /* ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
        CustomerService customerService= (CustomerService) context.getBean("customerService");
        Customer c=new Customer();
        c.setId(49L);
        Customer query = customerService.query(c);
        System.out.println(query);*/
        /*修改用户密码*/
        /*ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
        CustomerService customerService= (CustomerService) context.getBean("customerService");
        Customer customer=new Customer();
        customer.setCustomerName("pan");
        customer.setCustomerPassword("1234567");
        Customer customer1 = customerService.query(customer);
        customer1.setCustomerPassword("12345678");
        customerService.updateCustomerPassword(customer1);*/
        ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
        CustomerService customerService= (CustomerService) context.getBean("customerService");
        Customer customer=new Customer();
        customer.setCustomerName("pan");
        customer.setCustomerPassword("12345678");
        customer = customerService.query(customer);
        List<Address> addressList1  = customer.getAddressList();
        for (Address address : addressList1) {
            System.out.println(address);
        }

       /* List<OrderList> orderLists=customer.getOrderLists();
        for (OrderList orderList : orderLists) {
            System.out.println(orderList);
        }*/

        //通过用户姓名和密码删除用户
        /*ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
        CustomerService customerService= (CustomerService) context.getBean("customerService");
        Customer customer=new Customer();
        customer.setCustomerName("张三");
        customer.setCustomerPassword("1234567");
        boolean delete = customerService.delete(customer);
        System.out.println(delete);*/
        //通过用户ID删除用户
        /*ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
        CustomerService customerService= (CustomerService) context.getBean("customerService");
        Customer customer=new Customer();
        customer.setId(53L);
        boolean delete = customerService.delete(customer);
        System.out.println(delete);*/



        //通过用户姓名和密码修改密码
       /* CustomerService customerService=new CustomerServiceImpl();
        Customer customer=new Customer();
        customer.setCustomerName("张三");
        customer.setCustomerPassword("1234567");
        Customer customer1 = customerService.query(customer);
        customer1.setCustomerPassword("12345678");
        boolean b = customerService.updateCustomerPassword(customer1);
        System.out.println(b);*/
        //通过用户ID修改密码
        /*CustomerService customerService=new CustomerServiceImpl();
        Customer customer=new Customer();
        customer.setId(49L);
        Customer customer1 = customerService.query(customer);
        customer1.setCustomerPassword("1234567");
        boolean b = customerService.updateCustomerPassword(customer1);
        System.out.println(b);*/



        //通过id查询用户
       /* CustomerService customerService=new CustomerServiceImpl();
        Customer customer=new Customer();
        customer.setId(51L);
        customer = customerService.query(customer);
        System.out.println(customer);*/
        //通过用户名和密码查询用户
      /*  CustomerService customerService=new CustomerServiceImpl();
        Customer customer=new Customer();
        customer.setCustomerName("pan");
        customer.setCustomerPassword("1234567");
        customer = customerService.query(customer);
        System.out.println(customer);*/
        //通过用户查询用户地址
        /*CustomerService customerService=new CustomerServiceImpl();
        Customer customer=new Customer();
        customer.setCustomerName("张三");
        customer.setCustomerPassword("1234567");
        customer.setCustomerEmail("1234567@qq.com");
        customer.setCustomerPhone("123456789654");
        customer = customerService.query(customer);
        customer =customerService.queryCustomerAddress(customer);
        System.out.println(customer);
        List<Address> addressList = customer.getAddressList();
        for (Address address : addressList) {
            System.out.println(address);
        }*/



        /*OrderListService orderListService=new OrderListServiceImpl();
        OrderList orderList = orderListService.queryOrderListById(33L);
        System.out.println(orderList);
        System.out.println(orderList.getCustomer());*/


       /* ProductService productService=new ProductServiceImpl();
        Product product=new Product();
        product.setProductName("空调");
        product.setProductPrice(new BigDecimal(88888));
        product.setProductType("电器");
        boolean add = productService.add(product);
        System.out.println(add);*/

        //查询商品中带iphone的商品信息
       /* ProductService productService=new ProductServiceImpl();
        List<Product> productList = productService.queryProductLikePhone("手机", "iphone");
        for (Product product : productList) {
            System.out.println(product);
        }*/

        //增加商品信息
       /* ProductService productService=new ProductServiceImpl();
        Product product=new Product();
        product.setProductName("空调");
        product.setProductPrice(new BigDecimal(88888));
        product.setProductType("电器");
        boolean add = productService.add(product);
        System.out.println(add);*/



        //通过商品详情和价格查询商品信息x  xxxxxxx  xxxxxxxxxxxx    xxxxxxxx
       /*ProductService productService=new ProductServiceImpl();
        Product product=new Product();
        product.setProductName("iphone");
        product.setProductPrice(new BigDecimal(8888));
        product.setProductType("手机");
        List<Product> products = productService.queryProducBydetailandPrice(product);
        for (Product product1 : products) {
            System.out.println(product1);
        }*/

        //管理员登录
       /* AdminService adminService=new AdminServiceImpl();
        Admin admin=new Admin();
        admin.setId(1L);
        Admin query = adminService.query(admin);
        System.out.println(query);*/


        //管理员增加商品和商品详情
       /* ProductService  productService=new ProductServiceImpl();
        Product  product=new Product();
        product.setProductName("饮水机");
        product.setProductType("电器");
        product.setProductPrice(new BigDecimal(2000.00));
        ProductDetail  productDetail=new ProductDetail();
        productDetail.setProductCaption("我们不生产水，我们只是大自然的搬运工");
        productDetail.setSmallImage("http://aqwerqerqwer/aaa.jpg");
        productDetail.setBigImage("http://aqwerqerqwer/aaa.jpg");
        product.setProductDetail(productDetail);
        productService.add(product);*/


        //增加上架商品
        /*ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
        ProductShelfService productShelfService = (ProductShelfService) context.getBean("productShelfService");
        ProductShelf productShelf=new ProductShelf();
        productShelf.setProductId(49L);
        productShelf.setOperTime(new Timestamp(new Date().getTime()));
        productShelfService.add(productShelf);*/

        /*productShelf.setIsUpShelf(1);
        productShelf.setId(1L);*/
        /*ProductShelfService  productService=new ProductShelfServiceImpl();
        productService.queryAll();*/
    }
}
