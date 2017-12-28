package com.iotek.service.impl;


import com.iotek.dao.CustomerDao;
import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by 15311 on 2017/12/17.
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao customerDao;

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public boolean add(Customer customer) {
        ThrowIfn(customer);
      return customerDao.add(customer);
    }

    @Override
    public boolean delete(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public Customer query(Customer customer) {
        ThrowIfn(customer);
        return customerDao.query(customer);
    }

    @Override
    public List<Customer> queryAll() {
        return null;
    }

    @Override
    public boolean registerCustomer(Customer customer) {
        return add(customer);
    }

    @Override
    public Customer queryAddressByCId(Customer customer) {
        ThrowIfn(customer);
       return customerDao.queryAddressByCId(customer);
    }

    @Override
    public boolean updateCustomerPassword(Customer customer) {
        ThrowIfn(customer);
        return customerDao.updateCustomerPassword(customer);
    }
    public void ThrowIfn(Customer customer){
        if (customer == null) {
            throw new NullPointerException("customer is not null");
        }
    }
}
