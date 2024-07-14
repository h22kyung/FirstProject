package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//이 클래스는 엔티티 이다!!
//테이블은 클래스 이름과 동일하게 생성된다 ..
@Entity
public class Article {
    @Id //엔티티의 대푯값 지정
    @GeneratedValue //자동으로 매겨짐
    private Long id;

    @Column //db 테이블의 title 열과 연결되도록 ..
    private String title;
    @Column
    private String content;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;

    }
}
