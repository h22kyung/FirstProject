package com.example.firstproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//이클래스는 컨트롤러임을 선언
@Controller
public class FirstController {
    @GetMapping("/hi") //localhost:8080/hi로 접속하면 greetings.mustache파일을 찾아서 반환하라
    public String niceToMeetYou(Model model) { //컨트롤러의 메서드에서 매개변수로 받아옴
        //model객체가 희경이 값을 username에 연결해 웹 브라우저로 보냄
        model.addAttribute("username", "희경이");
        return "greetings";
    }
}