package com.example.accounts.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@ToString
public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "customer_id")
        private int customerId;
        private String name;
        private String email;
        @Column(name = "mobile_number")
        private String mobileNumber;
        @Column(name = "create_dt")
        private LocalDate createDt;

        public int getCustomerId() {
                return customerId;
        }

        public void setCustomerId(int customerId) {
                this.customerId = customerId;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getMobileNumber() {
                return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
                this.mobileNumber = mobileNumber;
        }

        public LocalDate getCreateDt() {
                return createDt;
        }

        public void setCreateDt(LocalDate createDt) {
                this.createDt = createDt;
        }
}
