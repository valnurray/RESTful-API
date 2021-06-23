package com.lankin.rest.controller;

import com.lankin.rest.model.Article;
import com.lankin.rest.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //build get all articles REST API
    @GetMapping
    public List<Article> getAllArticle() {
        return articleService.getAllArticles();

    }

    //build get article by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable("id") long articleId){
        return new ResponseEntity<Article>(articleService.getArticleById(articleId), HttpStatus.OK);
    }
}
