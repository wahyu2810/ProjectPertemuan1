package com.demo.projectpertemuan1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @RequestMapping("/")
    public String hello(){
        return "Wahyu Noer Rahmat";
    }
}
