package com.board.ghboardproject.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

@DisplayName("View 컨트롤러 - 게시글")
@WebMvcTest(ArticleController.class)
class ArticleControllerTest {
    private final MockMvc mvc;

    ArticleControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("[view][GET] 게시글 리스트 - 정상 호출")
    @Test
    public void givenNothing_whenRequestingArticlesView_thenReturnArticlesView() throws Exception {
        // Given

        // WHen & Then
        mvc.perform(get("/articles"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect((content().contentType(MediaType.TEXT_HTML)))
                .andExpect(model().attributeExists("articles"));

    }

    @DisplayName("[view][GET] 게시글 상세 페이지 - 정상 호출")
    @Test
    public void givenNothing_whenRequestingArticleView_thenReturnArticleView() throws Exception {
        // Given

        // WHen & Then
        mvc.perform(get("/articles/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect((content().contentType(MediaType.TEXT_HTML)))
                .andExpect(model().attributeExists("article"));

    }

    @DisplayName("[view][GET] 게시글 검색 전용 페이지 - 정상 호출")
    @Test
    public void givenNothing_whenRequestingArticleSearchView_thenReturnArticleSearchView() throws Exception {
        // Given

        // WHen & Then
        mvc.perform(get("/articles/search"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect((content().contentType(MediaType.TEXT_HTML)));

    }

    @DisplayName("[view][GET] 해시태그 검색 페이지 - 정상 호출")
    @Test
    public void givenNothing_whenRequestingArticleHashtagSearchView_thenReturnArticleHashtagSearchView() throws Exception {
        // Given

        // WHen & Then
        mvc.perform(get("/articles/search-hashtag"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect((content().contentType(MediaType.TEXT_HTML)));
    }
}