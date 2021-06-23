package com.lankin.rest.service;

import com.lankin.rest.model.Article;

import java.util.List;

public interface ArticleService {

    Article saveArticle (Article article);
    List <Article> getAllArticles();
    Article getArticleById(long id);
    Article updateArticle(Article article, long id);
    void deleteArticle(long id);
}
