package com.board.ghboardproject.repository;

import com.board.ghboardproject.config.JpaConfig;
import com.board.ghboardproject.domain.Article;
import com.board.ghboardproject.domain.ArticleComment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class JPARepositoryTest {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    public JPARepositoryTest(@Autowired ArticleRepository articleRepository, @Autowired ArticleCommentRepository articleCommentRepository) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }

    @Test
    void givenTestData_whenSelecting_theWorksFine(){
        // Given

        // When
        List<Article> articles = articleRepository.findAll();

        // Then
        assertThat(articles).isNotNull().hasSize(0);
    }
}