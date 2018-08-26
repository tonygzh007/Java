package com.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    /**
     * 这个是测试XML文件配置的AOP
     * @param args
     */
    public static void main(String[] args){
        ApplicationContext as= new ClassPathXmlApplicationContext("bean.xml");
        ICustomerService cs= (ICustomerService) as.getBean("customerServiceAOP");
        cs.Save();
        cs.update(20);
        cs.delete(30);
    }
}
