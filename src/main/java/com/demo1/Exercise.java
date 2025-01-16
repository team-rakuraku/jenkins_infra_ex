package com.demo1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class Exercise {
    @GetMapping("")
    public String helloSpringboot(){
        return "HelloSpringBoot";
    }
}
