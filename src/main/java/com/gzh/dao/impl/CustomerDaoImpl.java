package com.gzh.dao.impl;

import com.gzh.dao.ICustomerDao;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements ICustomerDao{
    @Override
    public void save() {
        System.out.println("持久层保存了数据到数据库中");
    }

    @Override
    public void getAll() {
        System.out.println("调用getAll");
    }

    @Override
    public void getOne() {
        System.out.println("调用getOne");
    }

    @Override
    public void del() {
        System.out.println("调用del");
    }

    @Override
    public void update() {
        System.out.println("调用update");
    }
}
