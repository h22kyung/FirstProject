package com.example.firstproject.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController //rest api는 rest컨트롤러 붙여야함
public class FirstApiController {
    //localhost:8080/api/hello 로 출력하는 메서드 작성
    @GetMapping("/api/hello")
    public String hello(){
        return "hello!!!";
    }


}
