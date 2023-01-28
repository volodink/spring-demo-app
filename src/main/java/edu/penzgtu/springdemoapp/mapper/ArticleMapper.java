package edu.penzgtu.springdemoapp.mapper;

import edu.penzgtu.springdemoapp.dto.ArticleDto;
import edu.penzgtu.springdemoapp.entity.Article;
import jakarta.annotation.PostConstruct;
import org.modelmapper.Condition;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {
    private final ModelMapper modelMapper;

    public ArticleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    private void init() {
        modelMapper.createTypeMap(ArticleDto.class, Article.class);
        modelMapper.createTypeMap(Article.class, ArticleDto.class);

        Condition skipIds = new Condition() {
            @Override
            public boolean applies(MappingContext context) {
                return !context.getMapping().getLastDestinationProperty().getName().equals("id");
            }
        };

        modelMapper.getConfiguration().setPropertyCondition(skipIds);
    }

    public Article toEntity(ArticleDto articleDto) {
        return modelMapper.map(articleDto, Article.class);
    }

    public ArticleDto toDto(Article article) {
        return modelMapper.map(article, ArticleDto.class);
    }
}
