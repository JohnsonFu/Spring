package com.fulinhua.controller;

import com.fulinhua.Service.BookService;
import com.fulinhua.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.util.List;

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
       // model.addAttribute("book",new Book());
        return "BookAddForm";
    }
    @RequestMapping(value="/book_save")
    public String saveBook(Book book){
        bookService.save(book);
        return "redirect:/book_list";
    }
    @RequestMapping(value="/book_list")
    public String showBook(Model model) throws SQLException {
        List<Book> list=bookService.getAllBooks();
        model.addAttribute("books",list);
        return "BookShow";
    }
    @RequestMapping(value="/book_remove/{id}")
    public String removeBook(@PathVariable int id, Model model) throws SQLException {
        bookService.remove(id);
        List<Book> list=bookService.getAllBooks();
        model.addAttribute("books",list);
        return "redirect:/book_list";
    }

    @RequestMapping(value="/book_edit/{id}")//跳转到编辑页面
    public String editBook(Model model,@PathVariable int id){
         Book book=bookService.getBook(id);
        model.addAttribute("book",book);
        return "BookEditForm";
    }
    @RequestMapping(value="/book_update")
    public String updateBook( Book book){
        bookService.update(book);
        return "redirect:/book_list";
    }

}
