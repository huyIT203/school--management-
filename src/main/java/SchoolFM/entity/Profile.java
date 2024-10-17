package SchoolFM.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String christianName;
    private String fullName;
    private Date dob;
    private Date baptismDate;
    private Date eucharisticDate;
    private Date confirmationDate;
    private Date solemnCommunicationDate;
    private Date professLastDate;
    private Date graduatedDate;
    private String address;
    private String city;
    private String nameOfFather;
    private String nameOfMother;
    private String district;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChristianName() {
        return christianName;
    }

    public void setChristianName(String christianName) {
        this.christianName = christianName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getBaptismDate() {
        return baptismDate;
    }

    public void setBaptismDate(Date baptismDate) {
        this.baptismDate = baptismDate;
    }

    public Date getEucharisticDate() {
        return eucharisticDate;
    }

    public void setEucharisticDate(Date eucharisticDate) {
        this.eucharisticDate = eucharisticDate;
    }

    public Date getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public Date getSolemnCommunicationDate() {
        return solemnCommunicationDate;
    }

    public void setSolemnCommunicationDate(Date solemnCommunicationDate) {
        this.solemnCommunicationDate = solemnCommunicationDate;
    }

    public Date getProfessLastDate() {
        return professLastDate;
    }

    public void setProfessLastDate(Date professLastDate) {
        this.professLastDate = professLastDate;
    }

    public Date getGraduatedDate() {
        return graduatedDate;
    }

    public void setGraduatedDate(Date graduatedDate) {
        this.graduatedDate = graduatedDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameOfFather() {
        return nameOfFather;
    }

    public void setNameOfFather(String nameOfFather) {
        this.nameOfFather = nameOfFather;
    }

    public String getNameOfMother() {
        return nameOfMother;
    }

    public void setNameOfMother(String nameOfMother) {
        this.nameOfMother = nameOfMother;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
