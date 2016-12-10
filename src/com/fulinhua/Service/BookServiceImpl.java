package com.fulinhua.Service;

import com.fulinhua.bean.Book;
import com.fulinhua.dao.BaseDao;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Created by fulinhua on 2016/12/10.
 */
@Service
public class BookServiceImpl implements BookService {

    @Override
    public void save(Book book)  {
        BaseDao dao=new BaseDao();
        try {
            dao.add(book);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
