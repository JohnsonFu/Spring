package com.fulinhua.controller;

import com.fulinhua.bean.Book;
import com.fulinhua.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fulinhua on 2016/12/30.
 */
@Controller
public class TestController {
@Autowired
    private BookMapper bookMapper;
    @RequestMapping(value = "index.do")
    public void indexPage() {
        Book entity = bookMapper.getBook(2);
        System.out.println("name：" + entity.getName());
    }
}