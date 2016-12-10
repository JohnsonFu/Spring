package com.fulinhua.controller;

import com.fulinhua.Service.BookService;
import com.fulinhua.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fulinhua on 2016/12/10.
 */
@Controller
public class BookController  {
    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Autowired
   private BookService bookService;
    @RequestMapping(value="/book_input")
    public String inputBook(Model model){
        model.addAttribute("book",new Book());
        return "BookAddForm";
    }
    @RequestMapping(value="/book_save")
    public String saveBook(@ModelAttribute Book book){
        bookService.save(book);
        return "BookAddForm";
    }
}
