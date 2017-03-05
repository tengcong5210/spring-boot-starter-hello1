package com.tcc.chapter_6_5;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性配置
 * Created by ibm on 2017/3/5.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG="world";
    private String msg=MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
