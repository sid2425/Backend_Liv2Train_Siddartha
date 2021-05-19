package com.example.rest.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;


@Embeddable
class Address
{
    private String detailedAddress;
    private String city;
    private String state;
    private Integer pincode;

    Address(String detailedAddress, String city, String state, Integer pincode) {
        this.detailedAddress = detailedAddress;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public Address() {

    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
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

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
}


//- This class represent table in our database
@Entity
@Table(name="training_center")
public class TrainingCenter implements Serializable {

    /*
    @Constraints - represents various validations checks on request body
     */


    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(name = "center_name", nullable =false, length = 40)
    @NotNull(message = "Center name shouldn't be null")
    @Size(max=40,message = "Length of center name exceeded length 40\n")@Size(max=40,message = "Length of center name exceeded length 40\n")
    private String centerName;

    @Column(name="center_code",nullable = false,length = 12)
    @NotNull(message = "Center code shouldn't be null")
    @Size(min=10,max=12,message = "Length of center code shouldn't exceed 12\n")
    private String centerCode;

    @Column(name="address")
    @Embedded
    @NotNull(message = "Address Item is missing!\n")
    private Address address;

    @Column(name="capacity")
    private Integer capacity;

    @Column(name="courses_offered")
    @Lob
    private ArrayList<String> coursesOffered;

    @Column(name="created_on")
    private LocalDateTime createdOn;


    @Column(name="contact_email",unique = true)
    @NotNull(message = "Email shouldn't be null")
    @Email(message="Please provide a valid email address")
    @Pattern(regexp=".+@.+\\..+", message="Please provide a valid email address")
    private String contactEmail;

    @Column(name="contact_phone",nullable = false,unique = true)
    @Size(max=10,min=10,message="Incorrect Phone number")
    private String contactPhone;

    public TrainingCenter(Integer id, String centerName, String centerCode, Address address, Integer capacity, ArrayList<String> coursesOffered, LocalDateTime createdOn, String contactEmail, String contactPhone) {
        this.id = id;
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.address = address;
        this.capacity = capacity;
        this.coursesOffered = coursesOffered;
        this.createdOn = createdOn;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    public TrainingCenter()
    {
        this.address=new Address();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ArrayList<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(ArrayList<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
