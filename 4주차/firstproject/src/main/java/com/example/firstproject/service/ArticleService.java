package com.example.firstproject.service;

import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;
    //Create
    public Article createArticle(Article article){
        if (article.getTitle() == null || article.getContent() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Title and content cannot be null");
        }

        try {
            return articleRepository.save(article);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error occurred while saving the article", e);
        }
    }

    //read
    public List<Article> getAllArticles() {
        return (List<Article>) articleRepository.findAll();
    }
    public Optional<Article> getArticleById(Long id) {
        return articleRepository.findById(id);
    }
    //put
   /* public Article updateArticle(Long id, Article articleDetails) {
        //타킷 조회
        Optional<Article> update = articleRepository.findById(id);
        article.setTitle(articleDetails.getTitle());
        article.setContent(articleDetails.getContent());
        return articleRepository.save(article);
    }*/

    //delete
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }
    }

