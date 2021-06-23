package com.lankin.rest.repository;

import com.lankin.rest.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//need or not @?
//@Repository
/**
 * SimpleRepository.class already have @Repository annotation and JpaRepository extends from it
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
