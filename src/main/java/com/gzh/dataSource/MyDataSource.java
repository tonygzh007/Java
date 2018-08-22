package com.gzh.dataSource;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 自定义连接池，使用代理模式来做
 * 2018年8月23日 02:12:13
 */
public class MyDataSource {
    //定义一个池，用于存放连接
    //ArrayList线程不安全
    //Collections.synchronizedList把ArrayList转成线程安全的
    private static List<Connection> pool = Collections.synchronizedList(new ArrayList<Connection>());
    static {
        for (int i = 0; i < 10; i++) {

        }
        
    }
}
