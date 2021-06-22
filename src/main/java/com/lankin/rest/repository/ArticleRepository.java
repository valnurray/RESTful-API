package com.lankin.rest.repository;

import com.lankin.rest.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//need or not @?
//@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
