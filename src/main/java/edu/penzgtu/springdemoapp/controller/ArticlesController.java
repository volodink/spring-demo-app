package edu.penzgtu.springdemoapp.controller;

import edu.penzgtu.springdemoapp.dto.ArticleDto;
import edu.penzgtu.springdemoapp.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticlesController implements ArticlesApi {
    private final ArticleService articleService;

    @GetMapping
    public List<ArticleDto> getArticles() {
        return articleService.getArticles();
    }

    @PostMapping
    public ArticleDto createArticle(ArticleDto article) {
        return articleService.createArticle(article);
    }
}
