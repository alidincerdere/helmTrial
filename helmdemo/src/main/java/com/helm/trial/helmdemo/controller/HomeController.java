package com.helm.trial.helmdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adere on 1.12.2019.
 */
@RestController
public class HomeController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello world";
    }
}
