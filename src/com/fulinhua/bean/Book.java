package com.fulinhua.bean;

import java.io.Serializable;

/**
 * Created by fulinhua on 2016/12/10.
 */
public class Book implements Serializable {
    public Book(){};
    public Book(String name, String author, double price) {
        super();
        this.name = name;
        this.author = author;
        this.price = price;
    }
    private int id;
    private String name;
    private String author;
    private double price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
