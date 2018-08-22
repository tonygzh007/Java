package com.gzh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 模拟一个剧组，雇演员
 */
public class Client {
    public static void main(String[] args){
     /*   动态代理
        作用：不改变源码的基础上，对已有的方法增强。（它是AOP思想的实现技术）
        分类：
        第一类：基于接口的动态代理：
        要求：被代理类最少实现一个接口
        提供者：JDK官方
        涉及的类：Proxy
        创建代理对象的方法：newProxyInstance(ClassLoader,Class[],InvocationHandler)
        参数的含义：
        ClassLoader：类加载器。和被代理对象使用相同的类加载器。一般都是固定写法
        Class[]：字节码数组。被代理类实现的接口。（要求代理对象和被代理对象具有相同的行为）。一般都是固定写法
        InvocationHandler：它是一个接口。就是用于我们提供增强代码的。我们一般都是写一个该接口的实现类。实现类可以是匿名内部类。它的含义就是：如何代理。此处的代码只能是谁用谁提供。
        策略模式：（比如ResultSetHandle是一个接口，有9个类实现了该接口）
        使用要求：数据已经有了
                目的明确
        达成目标的过程就是策略
                在dbutils中的ResultSetHandle就是策略模式的具体应用*/

        /*匿名内部类，访问外部变量，外部变量必须是final修饰*/
        final Actor actor= new Actor();

        /*创建动态代理对象*/
        ICator proxyActor=(ICator) Proxy.newProxyInstance(Actor.class.getClassLoader(), Actor.class.getInterfaces(), new InvocationHandler() {
            /**
             * 执行被代理对象的任何方法都会经过该方法，该方法有拦截的功能
             * @param proxy     代理对象的引用。不一定每次都会用。
             * @param method    当前执行的方法
             * @param args      当前执行方法所需的参数
             * @return          当前执行方法的返回值
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //1.取出执行方法中的参数：给的多少钱
                Float money= (Float) args[0];
                //2.判断当前执行的是什么方法
                if("basicAct".equals(method.getName())){
                    if(money > 10000){
                        //执行方法
                        method.invoke(actor,money);
                    }
                }
                if("dangerAct".equals(method.getName())){
                    if(money > 50000){
                        //执行方法
                        method.invoke(actor,money);
                    }
                }

                return null;
            }
        });

        proxyActor.basicAct(10001);
        proxyActor.dangerAct(50001);

    }
}
