package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

//이 클래스는 엔티티 이다!!
//테이블은 클래스 이름과 동일하게 생성된다 ..
@Entity
public class Article {
    @Id //엔티티의 대푯값 지정
    @GeneratedValue //자동으로 매겨짐
    private Long id;
    @Column //db 테이블의 title 열과 연결되도록 ..
    @Size(min=2, message = "Name should have atleast 2 characters")
    private String title;
    @Column
    private String content;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

  /*  public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;

    }*/
}
