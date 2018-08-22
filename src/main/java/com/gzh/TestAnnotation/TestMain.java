package com.gzh.TestAnnotation;


import java.lang.reflect.Method;

public class TestMain {
    public static void main(String[] args) throws Exception{
        Class clazz=TestClass.class;
        Method[] ms= clazz.getMethods();
        for(Method m: ms){

            //方法上是否有这个注解
            boolean bl= m.isAnnotationPresent(MyTest.class);
//            System.out.println(m.getName() + "==" + bl);

            if(bl){
                m.invoke( clazz.newInstance(),null);

            }
        }
    }
}
