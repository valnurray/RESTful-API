package com.lankin.rest.controller;

import com.lankin.rest.model.Article;
import com.lankin.rest.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    //build create article REST API
    @PostMapping
    public ResponseEntity <Article> saveArticle(@RequestBody Article article) {
        return new ResponseEntity<Article>(articleService.saveArticle(article), HttpStatus.CREATED);
    }



}
