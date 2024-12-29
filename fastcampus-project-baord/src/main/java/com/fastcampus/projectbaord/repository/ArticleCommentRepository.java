package com.fastcampus.projectbaord.repository;

import com.fastcampus.projectbaord.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
