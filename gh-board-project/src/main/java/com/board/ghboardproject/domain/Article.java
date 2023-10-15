package com.board.ghboardproject.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id; // 고유 번호
    private String title; // 제목
    private String content; // 내용
    private String hashtag; // 해시 태그
    private LocalDateTime createdAt; // 생성 일시
    private String createdBt; // 생성자
    private LocalDateTime modifiedAt; // 수정 일시
    private String modifiedBy; // 수정자

}
