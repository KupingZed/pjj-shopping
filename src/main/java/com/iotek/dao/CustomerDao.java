package com.iotek.dao;

import com.iotek.po.Customer;

/**
 * Created by 15311 on 2017/12/17.
 */
public interface CustomerDao extends BaseDao<Customer>{
    Customer queryAddressByCId(Customer customer);
    boolean updateCustomerPassword(Customer customer);
}
