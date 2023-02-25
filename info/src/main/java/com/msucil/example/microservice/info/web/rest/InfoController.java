package com.msucil.example.microservice.info.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/info")
public class InfoController {

    @GetMapping()
    public String info(){
        return "Info Service";
    }
}
