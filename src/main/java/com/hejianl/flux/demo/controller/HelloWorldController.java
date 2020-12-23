package com.hejianl.flux.demo.controller;

import com.hejianl.flux.demo.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {
    @GetMapping("/helloWorld")
    public Mono<String> helloWorld(){
        return Mono.just("hello world");
    }
    @GetMapping("/info")
    public Mono<UserDto> userInfo(){
        UserDto d = new UserDto();
        d.setAge(1);
        d.setName("何健良");
        d.setTel("18615791725");
        return Mono.just(d);
    }
}
