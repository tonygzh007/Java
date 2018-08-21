package com.gzh.service.impl;

import com.gzh.dao.ICustomerDao;
import com.gzh.service.ICustomerService;

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
}
