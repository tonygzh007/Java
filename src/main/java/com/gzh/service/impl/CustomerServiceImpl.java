package com.gzh.service.impl;

import com.gzh.dao.ICustomerDao;
import com.gzh.service.ICustomerService;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements ICustomerService {

    private ICustomerDao customerDao= null;

    /*使用set方法来注入*/
    public void setCustomerDao(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void saveCustomer() {
        customerDao.save();
    }

    @Override
    public void updateCustomer() {
        customerDao.update();
    }

    @Override
    public void delCustomer() {
        customerDao.del();
    }

    @Override
    public void getCustomerById() {
        customerDao.getOne();
    }

    @Override
    public void getAllCustomer() {
        customerDao.getAll();
    }
}
