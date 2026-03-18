package org.devops.basicdevops.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class TestController {




    @RequestMapping("/test"
    )
    public String testApplication( )
    {
        return " Hello from docker  container " ;
    }

}
