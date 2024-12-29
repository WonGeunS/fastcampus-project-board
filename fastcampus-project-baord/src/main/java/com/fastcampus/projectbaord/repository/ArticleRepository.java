package com.fastcampus.projectbaord.repository;

import com.fastcampus.projectbaord.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}