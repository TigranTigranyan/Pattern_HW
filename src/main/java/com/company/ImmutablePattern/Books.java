package com.company.ImmutablePattern;

import Singleton.SingletonCrateConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public final class Books {
    private final String code;
    private final String title;
    private final String author;
    private final   int publishing_year;
    private  final String descriptinon;

    public Books(String code, String title, String author, int publishing_year, String descriptinon) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.publishing_year = publishing_year;
        this.descriptinon = descriptinon;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishing_year() {
        return publishing_year;
    }

    public String getDescriptinon() {
        return descriptinon;
    }




    public static Set<Books> getAll() {
        Connection connection =
                SingletonCrateConn.getDbInstance().createConnection();

        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Set<Books> books = new HashSet<>();
        try {

            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM  Book_PHW.Author"
            );

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                books.add(new Books(
                        resultSet.getString("code"),
                        resultSet.getString("title"),
                        resultSet.getString("author"),
                        resultSet.getInt("publishing_year"),
                        resultSet.getString("descriptinon")

                ));
            }

        } catch (SQLException throwable) {
            System.out.println("Wrong query for Employee with id=");
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                System.out.println("Connection cannot close");
            }
        }
        return books;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Books{");
        sb.append("code='").append(code).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", publishing_year=").append(publishing_year);
        sb.append(", descriptinon='").append(descriptinon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

