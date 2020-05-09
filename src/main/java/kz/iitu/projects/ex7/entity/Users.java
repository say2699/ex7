package kz.iitu.projects.ex7.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;


    @OneToOne(mappedBy = "users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_books",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")}
    )

    private List<Books> booksList;

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        booksList = booksList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public void borrow(Books book) {

        this.booksList.add(book);
    }

}
