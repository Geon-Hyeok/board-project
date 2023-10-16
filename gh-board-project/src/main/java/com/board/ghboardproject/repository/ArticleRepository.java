package com.board.ghboardproject.repository;

import com.board.ghboardproject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}