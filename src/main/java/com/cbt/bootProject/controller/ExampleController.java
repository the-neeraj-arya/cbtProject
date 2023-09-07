/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.bootProject.controller;

import static jakarta.servlet.http.MappingMatch.PATH;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author neeraj
 */
@RestController
public class ExampleController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String showMessage() {
        return "Welcome to Spring Boot Programing";
    }

    @GetMapping(value = "/hello1")
    public String getMessage() {
        return "Hello World";
    }

    public String getErrorPath() {
        return PATH;
    }

    @RequestMapping(value = PATH, method = RequestMethod.GET)
    public String getErrorMessage() {
        return "Request resource not found";
    }
}
