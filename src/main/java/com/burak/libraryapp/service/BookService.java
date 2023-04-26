package com.burak.libraryapp.service;

import com.burak.libraryapp.dto.BookListItemResponse;
import com.burak.libraryapp.dto.SaveBookRequest;
import com.burak.libraryapp.model.Book;
import com.burak.libraryapp.model.Category;
import com.burak.libraryapp.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final CategoryService categoryService;
    public BookService(BookRepository bookRepository,
                       CategoryService categoryService) { //constructor injection
        this.bookRepository = bookRepository;
        this.categoryService = categoryService;
    }
    public List<BookListItemResponse> findAllBook(){
        //return bookRepository.findAll()
        return null;
    }
    @Transactional
    public BookListItemResponse saveBook(SaveBookRequest saveBookRequest){
        Category category= categoryService.getCategoryById(saveBookRequest.getCategoryId());
        final Book book= Book.builder()
                .bookStatus(saveBookRequest.getBookStatus())
                .author(saveBookRequest.getAuthor())
                .category(category)
                .bookStatus(saveBookRequest.getBookStatus())
                .lastReadPageNumber(saveBookRequest.getLastReadPageNumber())
                .totalPageNumber(saveBookRequest.getTotalPageNumber())
                .publisher(saveBookRequest.getPublisher())
                .title(saveBookRequest.getTitle())
                .build();

        final Book fromDb= bookRepository.save(book);

        return BookListItemResponse.builder()
                                    .bookStatus(fromDb.getBookStatus())
                                    .lastReadPageNumber(fromDb.getLastReadPageNumber())
                                    .publisher(fromDb.getPublisher())
                                    .categoryName(fromDb.getCategory().getName())
                                    .id(fromDb.getId())
                                    .title(fromDb.getTitle())
                                    .author(fromDb.getAuthor())
                                    .totalPageNumber(fromDb.getTotalPageNumber())
                                    .build();
    }
}
