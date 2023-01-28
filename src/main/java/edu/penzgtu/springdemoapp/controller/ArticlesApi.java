package edu.penzgtu.springdemoapp.controller;

import edu.penzgtu.springdemoapp.dto.ArticleDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Tag(name = "articles", description = "Контроллер для работы со статьями в журнале")
public interface ArticlesApi {
    @Operation(summary = "Returns all articles")
    public List<ArticleDto> getArticles();

    @Operation(summary = "Creates article")
    public ArticleDto createArticle(@RequestBody ArticleDto article);
}
