package edu.penzgtu.springdemoapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "articles")
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String articleName;
    @NonNull
    private String publicationYear;
}
