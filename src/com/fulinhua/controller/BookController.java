package com.fulinhua.controller;

import com.fulinhua.bean.Book;
import com.fulinhua.dao.BookMapper;
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

    @Autowired
    private BookMapper bookMapper;


    @RequestMapping(value="/book_input")
    public String inputBook(Model model){
       // model.addAttribute("book",new Book());
        return "BookAddForm";
    }
    @RequestMapping(value="/book_save")
    public String saveBook(Book book){
        bookMapper.insertBook(book);
        return "redirect:/book_list";
    }
    @RequestMapping(value="/book_list")
    public String showBook(Model model) throws SQLException {
        List<Book> list=bookMapper.getAllBook();
        model.addAttribute("books",list);
        return "BookShow";
    }
    @RequestMapping(value="/book_remove/{id}")
    public String removeBook(@PathVariable int id, Model model) throws SQLException {
        bookMapper.RemoveById(id);
        List<Book> list=bookMapper.getAllBook();
        model.addAttribute("books",list);
        return "redirect:/book_list";
    }

    @RequestMapping(value="/book_edit/{id}")//跳转到编辑页面
    public String editBook(Model model,@PathVariable int id){
         Book book=bookMapper.getBook(id);
        model.addAttribute("book",book);
        return "BookEditForm";
    }
    @RequestMapping(value="/book_update")
    public String updateBook( Book book){
        bookMapper.updateBook(book);
        return "redirect:/book_list";
    }

}
