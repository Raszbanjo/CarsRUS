package com.example.cars.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity(name ="member_table")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;

    @Column( columnDefinition = "CHAR(40)",nullable = false)
    private String firstName;

    @Column( length =60,nullable = false)
    private String lastName;

    @Column( length =100, nullable = false)
    private String street;

    @Column( length =100, nullable = false)
    private String city;

    @Column( length =100, nullable = false)
    private int zip;

    @Column(length=120,nullable = false,unique = true)
    private String email;

    @Column(length=60, nullable = false)
    private boolean approved;

    @Column(length=60, nullable = false)
    private int rank;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) { this.memberId = memberId; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public int getZip() { return zip; }

    public void setZip(int zip) { this.zip = zip; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
    public boolean isApproved() { return approved; }

    public void setApproved(boolean approved) { this.approved = approved; }

    public int getRank() { return rank; }

    public void setRank(int rank) { this.rank = rank; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member customer = (Member) o;
        return memberId == customer.memberId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }
}

