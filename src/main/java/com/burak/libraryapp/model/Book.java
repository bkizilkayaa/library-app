package com.burak.libraryapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="Book")
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
public class Book extends BaseModel {
    private String title;
    private String author;
    private BookStatus bookStatus;
    private Integer totalPageNumber;
    private Integer lastReadPageNumber;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToOne
    private Image image;
    private String publisher;
    private Long userId;
}
