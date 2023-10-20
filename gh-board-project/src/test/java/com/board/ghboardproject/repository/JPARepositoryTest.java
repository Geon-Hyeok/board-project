package com.board.ghboardproject.repository;

import com.board.ghboardproject.config.JpaConfig;
import com.board.ghboardproject.domain.Article;
import com.board.ghboardproject.domain.ArticleComment;
import com.board.ghboardproject.domain.UserAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class JpaRepositoryTest {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;
    private final UserAccountRepository userAccountRepository;

    public JpaRepositoryTest(
            @Autowired ArticleRepository articleRepository,
            @Autowired ArticleCommentRepository articleCommentRepository,
            @Autowired UserAccountRepository userAccountRepository
    ) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
        this.userAccountRepository = userAccountRepository;
    }

    @Test
    @DisplayName("select 테스트")
    void givenTestData_whenSelecting_thenWorksFine() {
            // Given
            long previousCount = articleRepository.count();
            UserAccount userAccount = userAccountRepository.save(UserAccount.of("uno", "pw", null, null, null));
            Article article = Article.of(userAccount, "new article", "new content", "#spring");

            // When
            articleRepository.save(article);

            // Then
            assertThat(articleRepository.count()).isEqualTo(previousCount + 1);
        }
    }
