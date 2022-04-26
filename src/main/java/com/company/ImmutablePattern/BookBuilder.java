package com.company.ImmutablePattern;

public class BookBuilder {
    private  String code;
    private  String title;
    private  String author;
    private    int publishing_year;
    private   String descriptinon;

    public BookBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setPublishing_year(int publishing_year) {
        this.publishing_year = publishing_year;
        return this;
    }

    public BookBuilder setDescriptinon(String descriptinon) {
        this.descriptinon = descriptinon;
        return this;
    }

    public Books build() {
        return new Books(code,title,author,publishing_year,descriptinon);
    }


}
