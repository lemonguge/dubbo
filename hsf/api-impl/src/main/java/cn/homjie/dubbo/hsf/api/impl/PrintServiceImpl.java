package cn.homjie.dubbo.hsf.api.impl;

import cn.homjie.dubbo.hsf.api.PrintService;

/**
 * @author jiehong.jh
 * @date 2018/3/28
 */
public class PrintServiceImpl implements PrintService {

    private String name;

    public PrintServiceImpl(String name) {this.name = name;}

    @Override
    public String send(String message) {
        System.out.println(name + " receive: " + message);
        return "success";
    }
}
