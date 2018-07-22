package com.example.webmvc.demo;

import com.example.webmvc.annotation.MyService;

/**
 * Created by James on 2018/7/22.
 */
@MyService
public class DemoServiceImpl implements IDemoService {

    public String query(String name) {
        System.out.println("start query");
        return "test query method";
    }
}
