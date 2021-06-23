package com.lankin.rest.service.impl;

import com.lankin.rest.exception.ResourceNotFoundException;
import com.lankin.rest.model.Article;
import com.lankin.rest.repository.ArticleRepository;
import com.lankin.rest.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

//    @Autowired
    /**
    * Starting with Spring 4.3, if a Class, which is configured as a Spring bean,
    * has only one constructor, the @Autowired annotation can be omitted
    * and Spring will use that constructor and inject all necessary dependencies
    */
        public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }
    /**
     * Description for Optional!
     * https://habr.com/ru/post/346782/
     */
    @Override
    public Article getArticleById(long id) {
//        Optional <Article> article = articleRepository.findById(id);
//        if(article.isPresent()){
//            return article.get();
//        }else {
//            throw new ResourceNotFoundException("article", "id", id);
//        }

        return articleRepository.findById(id).orElseThrow(() ->
                    new ResourceNotFoundException("article", "id", id));
    }
}
