package kz.iitu.projects.ex7.entity;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer houseNo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }
}
