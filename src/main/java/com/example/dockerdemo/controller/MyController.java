/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Surajit
 */
@RestController
public class MyController {

    @RequestMapping("/testdocker")
    public String getData() {
        return "In Docker Tutorial Project play java";
    }

    @RequestMapping("/greeting")
    public String greeting() {
        return "Welcome to my youtube channel";
    }
}
