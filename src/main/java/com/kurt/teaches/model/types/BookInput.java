package com.kurt.teaches.model.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.time.Year;

public class BookInput {
  private String name;

  private String author;

  private Status status;

  private String publisher;

  private Year publishedYear;

  private Genre genre;

  public BookInput() {
  }

  public BookInput(String name, String author, Status status, String publisher, Year publishedYear,
      Genre genre) {
    this.name = name;
    this.author = author;
    this.status = status;
    this.publisher = publisher;
    this.publishedYear = publishedYear;
    this.genre = genre;
  }

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

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Year getpublishedYear() {
    return publishedYear;
  }

  public void setpublishedYear(Year publishedYear) {
    this.publishedYear = publishedYear;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  @Override
  public String toString() {
    return "BookInput{name='" + name + "', author='" + author + "', status='" + status + "', publisher='" + publisher + "', publishedYear='" + publishedYear + "', genre='" + genre + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BookInput that = (BookInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(author, that.author) &&
        Objects.equals(status, that.status) &&
        Objects.equals(publisher, that.publisher) &&
        Objects.equals(publishedYear, that.publishedYear) &&
        Objects.equals(genre, that.genre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, author, status, publisher, publishedYear, genre);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    private String author;

    private Status status;

    private String publisher;

    private Year publishedYear;

    private Genre genre;

    public BookInput build() {
      BookInput result = new BookInput();
      result.name = this.name;
      result.author = this.author;
      result.status = this.status;
      result.publisher = this.publisher;
      result.publishedYear = this.publishedYear;
      result.genre = this.genre;
      return result;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder author(String author) {
      this.author = author;
      return this;
    }

    public Builder status(Status status) {
      this.status = status;
      return this;
    }

    public Builder publisher(String publisher) {
      this.publisher = publisher;
      return this;
    }

    public Builder publishedYear(Year publishedYear) {
      this.publishedYear = publishedYear;
      return this;
    }

    public Builder genre(Genre genre) {
      this.genre = genre;
      return this;
    }
  }
}
