package com.iotek.service;

import com.iotek.po.Customer;

/**
 * Created by 15311 on 2017/12/17.
 */
public interface CustomerService extends BaseService<Customer>{

    //      ע���û�
    boolean  registerCustomer(Customer customer);
    //      ��ѯ�û���ַ
    Customer queryAddressByCId(Customer customer);
   //       ɾ���û�
    boolean updateCustomerPassword(Customer customer);
}
