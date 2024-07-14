package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";}

    //새로 제목,내용을 쓰고 submit으로 데이터를 받아올 경우엔 post매핑!!, method도 post이기 때문
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){ //폼데이터를 dto로 받기
        System.out.println(form.toString());//logging 대신 println으로 확인

        // 1. dto를 엔티티로 변환
        // 1-1. Article 클래스와 toEntity 메서드 만들기
        Article article = form.toEntity();
        // 2. 리파지터리로 엔티티를 db에 저장



        return "";

    }
}
