package com.thrift.service;

import org.apache.thrift.TException;

public class HelloServiceImpl implements Hello.Iface{
	public String helloString(String para) throws TException {
        return para + "哈哈哈哈哈哈哈！";
    }
}
