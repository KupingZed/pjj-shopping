package com.iotek.service;

import com.iotek.po.Customer;

/**
 * Created by 15311 on 2017/12/17.
 */
public interface CustomerService extends BaseService<Customer>{

    //      注册用户
    boolean  registerCustomer(Customer customer);
    //      查询用户地址
    Customer queryAddressByCId(Customer customer);
   //       删除用户
    boolean updateCustomerPassword(Customer customer);
}
