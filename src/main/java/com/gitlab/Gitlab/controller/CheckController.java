package com.gitlab.Gitlab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class CheckController {

    @GetMapping("/check")
    public String check() {
        return "Everything works fine";
    }
}
