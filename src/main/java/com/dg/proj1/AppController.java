package com.dg.proj1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){

        return "Hello World From App";
    }

    @RequestMapping("/customHello")
    @ResponseBody
    public String customHello(){

        return "Custom Hello World From App";
    }
}
