package gr.hua.dit.ds.demo3.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

public class DonationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bloodType;
    private String livingArea;
    private LocalDate lastBloodTest;
    private LocalDate appointmentDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public DonationRequest() {
    }

    public DonationRequest(String bloodType, String livingArea, LocalDate lastBloodTest, LocalDate appointmentDate) {
        this.bloodType = bloodType;
        this.livingArea = livingArea;
        this.lastBloodTest = lastBloodTest;
        this.appointmentDate = appointmentDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public Long getId() {
        return id;
    }

    public String getLivingArea() {
        return livingArea;
    }

    public LocalDate getLastBloodTest() {
        return lastBloodTest;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public User getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    public void setLastBloodTest(LocalDate lastBloodTest) {
        this.lastBloodTest = lastBloodTest;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
