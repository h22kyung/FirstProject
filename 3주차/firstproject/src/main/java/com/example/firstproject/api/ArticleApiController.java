package com.example.firstproject.api;

import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleApiController {
        @Autowired
        private ArticleRepository articleRepository;

        //GET
        @GetMapping("/api/articles")
        public List<Article> index() {
                return articleRepository.findAll();
        }
        //POST
        //PUT
        //DELETe
}
