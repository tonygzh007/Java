package com.gzh.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Client2 {

    public static void main(String[] args){
       /* 第二类：基于子类的动态代理
        要求：被代理类不能是最终类。不能被final修饰
        提供者：第三方CGLib
        涉及的类：Enhancer（增强器）
        创建代理对象的方法：create(Class,Callback);
        参数的含义：
        Class:被代理对象的字节码
        Callback:如何代理。它和InvocationHandler的作用是一样的。它也是一个接口，我们一般使用该接口的子接口MethodInterceptor（拦截器），在使用时我们也是创建该接口的匿名内部类。*/
        final Actor actor= new Actor();
        Actor cglibActor=(Actor)Enhancer.create(actor.getClass(), new MethodInterceptor() {
            /**
             * 执行被代理对象的任何方法，都会经过此方法。它和基于接口的动态代理的invode方法的作用是一样的。
             * @param proxy         代理对象的引用。不一定每次都会用。
             * @param method        当前执行的方法
             * @param objects       当前执行方法所需的参数
             * @param methodProxy   当前执行方法的代理对象。一般不用
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //1.取出执行方法中的参数：给的多少钱
                Float money= (Float) objects[0];
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

        cglibActor.basicAct(50000);
        cglibActor.dangerAct(100000);

    }
}
