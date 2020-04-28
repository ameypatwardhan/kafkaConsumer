package com.techprimers.kafka.springbootkafkaconsumerexample.model;

public class Book {

    private String bookname;
    private String authorname;

    public Book() {
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Book(String bookname, String authorname) {

        this.bookname = bookname;
        this.authorname = authorname;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("bookname='").append(bookname).append('\'');
        sb.append(", authorname='").append(authorname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
