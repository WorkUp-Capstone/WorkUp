package com.workup.workup.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String about;

    @Column
    private String portfolio_link;

    @Column
    private String resume_link;

    @Column
    private String city;

    @Column
    private String state;

    @Column(length = 10)
    private String phone_number;

    @Column
    private String profile_image_url;

    @OneToOne
    private User user;

    @ManyToMany(mappedBy = "categories")
    private List<Category> categories;

    // Empty Constructor for Spring
    public Profile() {}

    // Constructors
    public Profile(String about, String portfolio_link, String resume_link, String city, String state, String phone_number, String profile_image_url, List<Category> categories) {
        this.about = about;
        this.portfolio_link = portfolio_link;
        this.resume_link = resume_link;
        this.city = city;
        this.state = state;
        this.phone_number = phone_number;
        this.profile_image_url = profile_image_url;
        this.categories = categories;
    }

    public Profile(long id, String about, String portfolio_link, String resume_link, String city, String state, String phone_number, String profile_image_url, List<Category> categories) {
        this.id = id;
        this.about = about;
        this.portfolio_link = portfolio_link;
        this.resume_link = resume_link;
        this.city = city;
        this.state = state;
        this.phone_number = phone_number;
        this.profile_image_url = profile_image_url;
        this.categories = categories;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPortfolio_link() {
        return portfolio_link;
    }

    public void setPortfolio_link(String portfolio_link) {
        this.portfolio_link = portfolio_link;
    }

    public String getResume_link() {
        return resume_link;
    }

    public void setResume_link(String resume_link) {
        this.resume_link = resume_link;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }
}
