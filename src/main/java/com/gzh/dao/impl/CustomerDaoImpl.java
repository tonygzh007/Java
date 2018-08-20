package com.gzh.dao.impl;

import com.gzh.dao.ICustomerDao;

public class CustomerDaoImpl implements ICustomerDao{
    @Override
    public void save() {
        System.out.println("持久层保存了数据到数据库中");
    }
}
