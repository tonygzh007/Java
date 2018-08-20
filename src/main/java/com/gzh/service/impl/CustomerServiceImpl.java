package com.gzh.service.impl;

import com.gzh.dao.ICustomerDao;
import com.gzh.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

    private ICustomerDao customerDao= null;
    @Override
    public void saveCustomer() {

        customerDao.save();
    }
}
