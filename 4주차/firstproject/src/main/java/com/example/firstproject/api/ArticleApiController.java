package com.example.firstproject.api;

import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleApiController {
        @Autowired
        private ArticleRepository articleRepository;
        @Autowired
        private ArticleService articleService;

        //GET
        @GetMapping("/get")
        public List<Article> getAllArticles() {
                return articleService.getAllArticles();
        }

        @GetMapping("/get/{id}")
        public Optional<Article> getArticleById(@PathVariable Long id) {
                return articleService.getArticleById(id);
        }

        //POST
        @PostMapping
        public Article createArticle(@RequestBody Article article) {
                return articleService.createArticle(article);
        }

        //PUT
        /*@PutMapping("/put/{id}")
        public Article updateArticle(@PathVariable Long id, @RequestBody Article articleDetails) {
                return articleService.updateArticle(id, articleDetails);
        }*/
        //DELETe
        @DeleteMapping("/delete/{id}")
        public void deleteArticle(@PathVariable Long id) {
                articleService.deleteArticle(id);
        }
}

