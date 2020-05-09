package kz.iitu.projects.ex7.entity;

import javax.persistence.*;

@Entity
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer pageNo;
    private int chapterNo;

    @Column(name = "book_id")
    private Long bookId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", insertable = false, updatable = false)
    private Books books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public int getChapterNo() {
        return chapterNo;
    }

    public void setChapterNo(int chapterNo) {
        this.chapterNo = chapterNo;
    }

    public Books getBook() {
        return books;
    }

    public void setBook(Books book) {
        this.books = book;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", pageNo=" + pageNo +
                ", chapterNo='" + chapterNo + '\'' +
                '}';
    }
}
