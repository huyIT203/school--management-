package SchoolFM.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class CatholicCeremony {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private String location;
    private String godParent;
    private String priest;
    private String number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGodParent() {
        return godParent;
    }

    public void setGodParent(String godParent) {
        this.godParent = godParent;
    }

    public String getPriest() {
        return priest;
    }

    public void setPriest(String priest) {
        this.priest = priest;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
