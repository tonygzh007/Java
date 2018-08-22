package com.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args){
        ApplicationContext as= new ClassPathXmlApplicationContext("bean.xml");
        ICustomerService cs= (ICustomerService) as.getBean("customerServiceAOP");
        cs.Save();
    }
}
