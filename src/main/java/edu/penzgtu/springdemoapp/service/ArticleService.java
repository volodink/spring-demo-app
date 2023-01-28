package edu.penzgtu.springdemoapp.service;

import edu.penzgtu.springdemoapp.dto.ArticleDto;
import edu.penzgtu.springdemoapp.entity.Article;
import edu.penzgtu.springdemoapp.mapper.ArticleMapper;
import edu.penzgtu.springdemoapp.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    public List<ArticleDto> getArticles() {
        return articleRepository.findAll().stream().map(articleMapper::toDto).toList();
    }

    public ArticleDto createArticle(ArticleDto articleDto) {
        Article articleEntity = articleMapper.toEntity(articleDto);
        var created = articleRepository.save(articleEntity);
        return articleMapper.toDto(created);
    }
}
