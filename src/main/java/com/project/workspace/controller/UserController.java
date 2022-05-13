package com.project.workspace.controller;


import com.project.workspace.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/main/*")
public class UserController {

    private final UserService userService;

    @GetMapping("/index")
    public void index(){

    }
    @GetMapping("/privacyTerm")
    public void privacyTerm(){

    }
    @GetMapping("/refundTerm")
    public void refundTerm(){

    }
    @GetMapping("/serviceTerm")
    public void serviceTerm(){

    }
    @GetMapping("/tradeTerm")
    public void tradeTerm(){

    }

}
















