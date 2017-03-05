package com.tcc.chapter_6_5;

/**
 * 要被自动配置的类
 * Created by ibm on 2017/3/5.
 */
public class HelloService {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String sayHello(){
        return "Hello "+msg;
    }
}
