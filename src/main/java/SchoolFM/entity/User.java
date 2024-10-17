package SchoolFM.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    private String password;
    private String phoneNumber;
    private String email;
    private Boolean isDeleted;
    private Boolean isActive;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Profile profile;

    @OneToMany(mappedBy = "user")
    private List<CatholicCeremony> catholicCeremonies;

    @OneToMany(mappedBy = "user")
    private List<UserEvent> userEvents;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<CatholicCeremony> getCatholicCeremonies() {
        return catholicCeremonies;
    }

    public void setCatholicCeremonies(List<CatholicCeremony> catholicCeremonies) {
        this.catholicCeremonies = catholicCeremonies;
    }

    public List<UserEvent> getUserEvents() {
        return userEvents;
    }

    public void setUserEvents(List<UserEvent> userEvents) {
        this.userEvents = userEvents;
    }




}
