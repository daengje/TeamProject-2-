package com.busanit501.teamproject2.lcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lcs")
public class lcsController {

    @GetMapping("/list")
    public String showIndexPage() {
        return "lcs/list";
    }
}