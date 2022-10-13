package com.example.demo.demo1;

import java.util.List;

/**
 * 
 * Created by mingliu.hu on 2017/8/2.
 * 
 */

public class BookServiceImpl {

    private BookDao bookDao = BookDao.getInstance();

    public List getAllBooks() {

        return bookDao.getAllBooks();

    }

    public BookDto getBook(String isbn) {

        return bookDao.getBook(isbn);

    }

    public String addBook(BookDto book) {

        return bookDao.addBook(book);

    }

    public String updateBook(BookDto book) {

        return bookDao.updateBook(book);

    }

}