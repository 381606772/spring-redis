package com.baizhi.seesionmanager.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("test")
public class TestRedisSessionManagerController {

    @RequestMapping("test")
    public void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<String> list = (List<String>)request.getSession().getAttribute("list");
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add("xxx");
        request.getSession().setAttribute("list", list);

        response.getWriter().println("size: " + list.size());
        response.getWriter().println("sessionId: " + request.getSession().getId());
    }
}
