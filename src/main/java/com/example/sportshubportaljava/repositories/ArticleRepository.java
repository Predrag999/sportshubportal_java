package com.example.sportshubportaljava.repositories;

import com.example.sportshubportaljava.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    Optional<Article> findArticleByArticleHeadline(String title);

}
