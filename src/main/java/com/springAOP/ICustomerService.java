package com.springAOP;

/**
 * 模拟一个客户的业务层接口
 * 2018年8月23日 03:16:29
 */
public interface ICustomerService {
    void Save();

    void update(int i);

    int delete(int i);
}
