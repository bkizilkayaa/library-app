package com.burak.libraryapp.dto;

import com.burak.libraryapp.model.BookStatus;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.File;

@Data
@SuperBuilder
public class BookListItemResponse {
    private Long id;
    private String title;
    private String author;
    private BookStatus bookStatus;
    private Integer totalPageNumber;
    private Integer lastReadPageNumber;
    private String categoryName;
    private File image;
    private String publisher;
}
