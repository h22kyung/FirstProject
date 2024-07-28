package com.example.firstproject.api;

import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleApiController {
        @Autowired
        private ArticleRepository articleRepository;
        @Autowired
        private ArticleService articleService;

        //GET
        //@GetMapping("/api/articles")
        //public List<Article> index() {
        //return articleRepository.findAll();
        //}


        //POST
        @PostMapping
        public Article createArticle(@RequestBody Article article){
                return articleService.createArticle(article);
        }
        //PUT
        //DELETe
}
