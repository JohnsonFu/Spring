package com.fulinhua.dao;

import com.fulinhua.bean.Book;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fulinhua on 2016/12/10.
 */
public class BaseDaoImpl<T> {
    public void add(T object) throws SQLException {
        Configuration conf = new Configuration()
                // 下面方法默认加载hibernate.cfg.xml文件
                .configure();
        // 以Configuration创建SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        // 创建Session
        Session sess = sf.openSession();
        // 开始事务
        Transaction tx = sess.beginTransaction();
        // 创建消息实例

        // 保存消息
        sess.save(object);
        // 提交事务
        tx.commit();
        // 关闭Session
        sess.close();
        sf.close();
    }

    public void update(T object) throws SQLException{
//		 PreparedStatement pstmt=null;
//			String sql="update  booklist set author=?,price=?  where name=?";
//			pstmt=this.con.prepareStatement(sql);
//			pstmt.setString(1,book.getAuthor());
//			pstmt.setDouble(2,book.getPrice());
//			pstmt.setString(3,book.getName());
//			pstmt.executeUpdate();
        Configuration conf = new Configuration()
                // 下面方法默认加载hibernate.cfg.xml文件
                .configure();
        // 以Configuration创建SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        // 创建Session
        Session sess = sf.openSession();
        // 开始事务
        Transaction tx = sess.beginTransaction();
        // 创建消息实例
        sess.update(object);
        // 提交事务
        tx.commit();
        // 关闭Session
        sess.close();
        sf.close();


    }



    public void Remove(T object){

        Configuration conf = new Configuration()
                // 下面方法默认加载hibernate.cfg.xml文件
                .configure();
        // 以Configuration创建SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        // 创建Session
        Session sess = sf.openSession();
        // 开始事务
        Transaction tx = sess.beginTransaction();
        // 创建消息实例
        sess.delete(object);
        // 提交事务
        tx.commit();
        // 关闭Session
        sess.close();
        sf.close();
    }


    public void delete(int id) throws SQLException{
//		 PreparedStatement pstmt=null;
//			String sql="delete from booklist where name=?";
//			pstmt=this.con.prepareStatement(sql);
//			pstmt.setString(1,bookname);
//			pstmt.executeUpdate();
        Configuration conf = new Configuration()
                // 下面方法默认加载hibernate.cfg.xml文件
                .configure();
        // 以Configuration创建SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        // 创建Session
        Session sess = sf.openSession();
        // 开始事务
        Transaction tx = sess.beginTransaction();
        // 创建消息实例

        Query query = sess.createQuery("delete  Book b  where b.id=?");
        query.setInteger(0, id);
        query.executeUpdate();
        // 提交事务
        tx.commit();
        // 关闭Session
        sess.close();
        sf.close();
    }

    public List<Book> getBooks() throws SQLException{
        List<Book> list=new ArrayList<Book>();
//		 PreparedStatement pstmt=null;
//			String sql="select * from booklist";
//			pstmt=this.con.prepareStatement(sql);
//			ResultSet result=pstmt.executeQuery();
//		while(result.next()){
//			Book book=new Book(result.getString("name"),result.getString("author"),result.getDouble("price"));
//			list.add(book);
//		}
//		return list;

        Configuration conf = new Configuration()
                // 下面方法默认加载hibernate.cfg.xml文件
                .configure();
        // 以Configuration创建SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        // 创建Session
        Session sess = sf.openSession();
        // 开始事务
        Transaction tx = sess.beginTransaction();
        // 创建消息实例

        Query query = sess.createQuery("from Book");
        list = query.list();

        // 提交事务
        tx.commit();
        // 关闭Session
        sess.close();
        sf.close();
        return list;
    }

    public Book getBook(int id) {
        Configuration conf = new Configuration()
                // 下面方法默认加载hibernate.cfg.xml文件
                .configure();
        // 以Configuration创建SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        // 创建Session
        Session sess = sf.openSession();
        // 开始事务
        Transaction tx = sess.beginTransaction();
        List<Book> list = sess.createQuery("from Book b where b.id=?")
                .setInteger(0, id)
                .list();
        if(list.size()==0) {
            return null;//未找到这本书
        }
        return list.get(0);


    }
}
