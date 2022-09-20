package com.example.sportshubportaljava.dto;

import com.example.sportshubportaljava.ArticleCategoryEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ArticleDTO {

    Long id;

    String articleHeadline;

    String caption;

    String content;

    Set<String> tags;

    ArticleCategoryEnum subcategory;

    String location;

    String picture;
}
