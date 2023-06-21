package com.ttb.helloworlds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/test")
    public String test() {
        String returnString = "SpringBoot에서 날라간 데이터 입니다.";
        return returnString;
    }

}
