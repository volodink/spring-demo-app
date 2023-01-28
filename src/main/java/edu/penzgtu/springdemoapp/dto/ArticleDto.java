package edu.penzgtu.springdemoapp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ArticleDto {

    @Schema(description = "Название статьи")
    private String articleName;

    @Schema(description = "Год публикации")
    private String publicationYear;
}
