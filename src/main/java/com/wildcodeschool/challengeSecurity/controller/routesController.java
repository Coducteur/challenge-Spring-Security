package com.wildcodeschool.challengeSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Struct;

@RestController
public class routesController {
    @GetMapping("/")
    public String Welcome(){
        return "Welcome to the SHIELD";
    }
    @GetMapping("/avengers/assemble")
    public String Avengers(){
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String bases(){
        return "la liste de toutes les bases !! t'as tes accès ???";
    }
}
