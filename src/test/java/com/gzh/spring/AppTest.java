package com.gzh.spring;

import com.gzh.service.ICustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AppTest 
{
    @Autowired
    ICustomerService cs= null;

    /**
     * 立即加载
     */
    @Test
    public void test1(){
        //1.获取容器
//        ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
//        //2.根据bean的id获取对象
//         cs= (ICustomerService) ac.getBean("customerServiceImpl");
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
