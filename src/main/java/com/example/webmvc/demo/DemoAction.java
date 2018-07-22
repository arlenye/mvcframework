package com.example.webmvc.demo;

import com.example.webmvc.annotation.MyAutowired;
import com.example.webmvc.annotation.MyController;
import com.example.webmvc.annotation.MyRequestMapping;
import com.example.webmvc.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by James on 2018/7/22.
 */
@MyController
public class DemoAction {
    @MyAutowired
    private IDemoService demoService;

    @MyRequestMapping("demo/query.json")
    public void query(HttpServletRequest request,
                      HttpServletResponse response,
                      @MyRequestParam("name") String username){
        String result = demoService.query(username);
        try {
            response.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
