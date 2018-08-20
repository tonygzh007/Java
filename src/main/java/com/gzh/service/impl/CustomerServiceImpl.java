package com.gzh.service.impl;

import com.gzh.dao.ICustomerDao;
import com.gzh.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

    private ICustomerDao customerDao= null;

    public CustomerServiceImpl(){
        System.out.println("已经创建对象了");
    }

    @Override
    public void saveCustomer() {

        customerDao.save();
    }
}
