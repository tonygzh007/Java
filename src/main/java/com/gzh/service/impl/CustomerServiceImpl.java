package com.gzh.service.impl;

import com.gzh.dao.ICustomerDao;
import com.gzh.service.ICustomerService;

//@Service
public class CustomerServiceImpl implements ICustomerService {

//    @Autowired
    private ICustomerDao customerDao= null;


    @Override
    public void saveCustomer() {
//        System.out.println("save");
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
