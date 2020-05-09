package kz.iitu.projects.ex7.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String authpr;


    @ManyToMany(mappedBy = "booksList", fetch = FetchType.LAZY)
    private List<Users> usersList;
    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    @OneToMany(mappedBy = "books", fetch = FetchType.LAZY)
    private List<Page> listPages;

    public List<Page> getListPages() {
        return listPages;
    }

    public void setListPages(List<Page> listPages) {
        this.listPages = listPages;
    }

    @OneToOne(mappedBy = "users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthpr() {
        return authpr;
    }

    public void setAuthpr(String authpr) {
        this.authpr = authpr;
    }



    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authpr='" + authpr + '\'' +
                ", usersList=" + usersList +
                '}';
    }

    public void addPage(Page page) {

        this.listPages.add(page);
    }


}
