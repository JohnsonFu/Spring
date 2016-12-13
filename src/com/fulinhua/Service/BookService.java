package com.fulinhua.Service;

import com.fulinhua.bean.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by fulinhua on 2016/12/10.
 */
public interface BookService {
  public  void save(Book book);
 public List<Book> getAllBooks() throws SQLException;

  public  void remove(int id);

  public  Book getBook(int id);

   public void update(Book book);
}
