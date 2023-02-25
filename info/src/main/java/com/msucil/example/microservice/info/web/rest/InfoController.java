package com.msucil.example.microservice.info.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/info")
public class InfoController {

    @GetMapping()
    public Mono<String> info(){
        return Mono.just("Info Service");
    }
}
