package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

//컨트롤러에서 폼데이터를 받을 때 dto에 담아 받는다!
//입력폼에서 제목, 내용을 submit으로 전송할 예정이니 필드 2개가 필요하다!
//dto의 필드명과 동일한 이름을 new.mustache에도 name의 속성값으로 써주면 폼에서 입력한 데이터가 dto의 필드와 연결된다.
public class ArticleForm {
    private String title;
    private String content;

    //데이터를 잘 받았는지 확인할 toString() 메서드 추가
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public ArticleForm(String content, String title) {
        this.content = content;
        this.title = title;


    }
//dto인 form 객체를 엔티티 객체로 변환함
    public Article toEntity() {

        return new Article(null,title,content);
    }
}
