package com.example.sportshubportaljava.services;

import com.example.sportshubportaljava.entities.Article;
import com.example.sportshubportaljava.exception.ArticleNotFoundException;
import com.example.sportshubportaljava.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArticleService {

    ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article addArticle(Article article) {
        return this.articleRepository.save(article);
    }


    public Article updateArticle(Article article) {
        return this.articleRepository.save(article);
    }

    @Transactional(readOnly = true)
    public List<Article> getAllArticles() {
        return this.articleRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Article getArticleById(Long id) {
        return articleRepository.findById(id).orElseThrow(() ->
                new ArticleNotFoundException("Article with id: " + id + " was not found."));
    }

    public void removeArticle(Long id) {
        this.articleRepository.deleteById(id);
    }

}



