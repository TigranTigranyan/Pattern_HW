package com.company;


import ShapeFactory.shFactory;
import com.company.ImmutablePattern.BookBuilder;
import com.company.ImmutablePattern.Books;

import static ShapeFactory.shFactory.createShFactory;


public class Main {


    public static void main(String[] args) {


        Books books =new Books("1","asd","Jozeph",1998,"adcr");
        System.out.println(books);

        Books bbb = new BookBuilder().setCode("12").setTitle("aaa").setAuthor("asdf").setPublishing_year(1222).setDescriptinon("aaa").build();
        System.out.println(bbb);
        createShFactory("triangle");
        createShFactory("circle");
        createShFactory("rectangle");

    }
}
