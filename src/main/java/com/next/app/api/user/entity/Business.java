package com.next.app.api.user.entity;

import jakarta.persistence.*;
import lombok.Cleanup;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "business_like98100")
public class Business {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "businessNumber", nullable = false)
    private String businessNumber;

    @Column(name = "companyName", nullable = false)
    private String companyName;

    @Column(name = "representativeName", nullable = false)
    private String representativeName;

    @Column(name = "contactEmail", nullable = false)
    private String contactEmail;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "registeredAt")
    private java.time.LocalDateTime regitsteredAt;

    @PrePersist
    protected void onRegister() {
        regitsteredAt = java.time.LocalDateTime.now();
    }


    // Getter, Setter
    public Long getId() {
        return id;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getAddress() {
        return address;
    }

    public java.time.LocalDateTime getRegitsteredAt() {
        return regitsteredAt;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
