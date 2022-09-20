package com.example.sportshubportaljava.entities;

import com.example.sportshubportaljava.ArticleCategoryEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "articles")
@NoArgsConstructor
@Getter
@Setter
public class Article {

    @Id
    @GeneratedValue
    Long id;

    String articleHeadline;

    @ManyToOne
    @JoinColumn(name = "author_id")

    User author;

    String caption;

    String content;

    //TODO ELement collection
//     Set<String> tags; //should be entity; ManyToMany

    @Enumerated(EnumType.STRING)
    ArticleCategoryEnum subcategory;

    String location;

    String picture;

    @OneToMany(mappedBy = "article")
    List<Comment> comments;

}
