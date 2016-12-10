package com.fulinhua.Service;

import com.fulinhua.bean.Book;
import com.fulinhua.dao.BaseDaoImpl;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by fulinhua on 2016/12/10.
 */
@Service
public class BookServiceImpl implements BookService {



    private BaseDaoImpl dao=new BaseDaoImpl();

    @Override
    public void save(Book book)  {
        try {
            dao.add(book);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Book> getAllBooks() throws SQLException {

        return dao.getBooks();
    }
}
