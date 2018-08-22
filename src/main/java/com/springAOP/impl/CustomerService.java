package com.springAOP.impl;

import com.springAOP.ICustomerService;

/**
 * 模拟客户业务层的实现类
 */
public class CustomerService implements ICustomerService {
    @Override
    public void Save() {
        System.out.println("保存了客户");
    }

    @Override
    public void update(int i) {
        System.out.println("更新了客户"+ i);
    }

    @Override
    public int delete(int i) {
        System.out.println("删除了客户"+i );
        return i;
    }
}
