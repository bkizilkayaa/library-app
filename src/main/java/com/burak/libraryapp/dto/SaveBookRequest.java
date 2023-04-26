package com.burak.libraryapp.dto;

import com.burak.libraryapp.model.BookStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

@Getter
@Setter
public final class SaveBookRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String author;
    @NotBlank
    private BookStatus bookStatus;
    @NotNull
    private Integer totalPageNumber;
    @NotNull
    private Integer lastReadPageNumber;
    @NotNull
    private Long categoryId;
    private File image;
    @NotBlank
    private String publisher;
}
