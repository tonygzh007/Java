package com.gzh.spring;

import com.gzh.service.ICustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * 立即加载
     */
    @Test
    public void test1(){
        //1.获取容器
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
        //2.根据bean的id获取对象
        ICustomerService cs= (ICustomerService) ac.getBean("customerService");
        cs.saveCustomer();
//        ICustomerService cs2= (ICustomerService) ac.getBean("customerService");
//        ICustomerDao cdao= (ICustomerDao) ac.getBean("customerDao");
//        //创建静态工厂
//        ICustomerService csFactory= (ICustomerService) ac.getBean("staticCustomerService");
//        //创建实例工厂
//        ICustomerService csInstanceFactory= (ICustomerService) ac.getBean("instanceCustomerService");
//        System.out.println(cs1==cs2);
//        System.out.println(cdao);
//        System.out.println(csFactory);
//        System.out.println(csInstanceFactory);
    }
}
