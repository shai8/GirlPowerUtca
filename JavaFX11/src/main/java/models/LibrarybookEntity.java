package models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "librarybook", schema = "girlpowerutca")
@NamedQueries({
        @NamedQuery(name = "LibrarybookEntity.findAll", query = "select l from LibrarybookEntity l"),
        @NamedQuery(name = "LibrarybookEntity.findByTitle", query = "select l from LibrarybookEntity l where l.title = ?1"),
        @NamedQuery(name = "LibrarybookEntity.findByAuthor", query = "select l from LibrarybookEntity l where l.author = ?1"),
        @NamedQuery(name = "LibrarybookEntity.findByYear", query = "select l from LibrarybookEntity l where l.year = ?1"),
        @NamedQuery(name = "LibrarybookEntity.findByCategory", query = "select l from LibrarybookEntity l where l.category = ?1"),
        @NamedQuery(name = "LibrarybookEntity.findByIsbn", query = "select l from LibrarybookEntity l where l.isbn = ?1"),
        @NamedQuery(name = "LibrarybookEntity.findById", query = "select l from LibrarybookEntity l where l.id = ?1")
})


public class LibrarybookEntity {

    @Basic
    @Column(name = "Title")
    private String title;
    @Basic
    @Column(name = "Author")
    private String author;
    @Basic
    @Column(name = "Year")
    private Integer year;
    @Basic
    @Column(name = "Category")
    private String category;
    @Basic
    @Column(name = "ISBN")
    private Long isbn;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibrarybookEntity that = (LibrarybookEntity) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(author, that.author) && Objects.equals(year, that.year) && Objects.equals(category, that.category) && Objects.equals(isbn, that.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, category, isbn, id);
    }


}

