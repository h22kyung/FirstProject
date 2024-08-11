package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

//CrudRepository는 JPA에서 제공하는 인터페이스
public interface ArticleRepository extends JpaRepository<Article, Long> {

    }

