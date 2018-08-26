package com.springAOP.utils;

/**
 * 一个用于记录日志的类
 */
public class Logger {
    public void printLog(){
        System.out.println("Logger中的pringLog方法开始记录日志了。");
    }

    public void closeLog(){
        System.out.println("Log记录完毕。");

    }

    public void closeParam(){
        System.out.println("带参数的会执行");
    }
}
