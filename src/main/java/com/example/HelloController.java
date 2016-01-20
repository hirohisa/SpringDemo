package com.example;

/**
 * Created by Hirohisa Kawasaki on 2016/01/20.
 */

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring MVC";
    }
}
