package com.lankin.rest.controller;

import com.lankin.rest.model.Article;
import com.lankin.rest.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Class {@code ArticleController} in package {@code com.lankin.rest.controller}
 *
 * RestController for Article
 *
 * @author Nikita Lankin
 * @version 1.0
 *
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    /**
     * build create article REST API
     * POST HTTP method (add new entity to DB)
     * @param article add to DB
     * @return save article and HTTP Response
     */
    @PostMapping
    public ResponseEntity <Article> saveArticle(@RequestBody Article article) {
        return new ResponseEntity<Article>(articleService.saveArticle(article), HttpStatus.CREATED);
    }

    /**
     * build get all articles REST API
     * GET HTTP method (find all entities in DB)
     * @return List of Articles
     */
    @GetMapping
    public List<Article> getAllArticle() {
        return articleService.getAllArticles();

    }

    /**
     * build get article by id REST API
     * GET HTTP method (find entity by DB)
     * @param articleId it's Entity id in DB
     * @return Article with id what we need
     */
    @GetMapping("{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable("id") long articleId){
        return new ResponseEntity<Article>(articleService.getArticleById(articleId), HttpStatus.OK);
    }

    /**
     * build get article REST API
     * PUT HTTP method (update entity by id in DB)
     * @param articleId it's Entity id in DB
     * @param article is new entity with new parameters
     * @return new entity with new parameters
     */
    @PutMapping("{id}")
    public ResponseEntity<Article> updateArticle(@PathVariable("id")  long articleId
                                                ,@RequestBody Article article) {
        return new ResponseEntity<Article>(articleService.updateArticle(article,articleId), HttpStatus.OK);
    }

    /**
     * build delete article REST API
     * DELETE HTTP method (delete entity by id from DB)
     * @param articleId it's Entity id in DB
     * @return massage and http response
     */
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteArticle(@PathVariable("id") long articleId){

        //delete article from DB
        articleService.deleteArticle(articleId);
        return new ResponseEntity<String>("Article deleted successfully", HttpStatus.OK);
    }










}
