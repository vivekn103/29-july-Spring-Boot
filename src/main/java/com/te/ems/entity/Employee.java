package com.te.ems.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Employee {
    @Id
    private String id;
    @Column(unique = true,name = "employee_id")
    private String employeeID;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoin;
    private Double salary;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employee")
    private List<Address> address;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private BankAccount bankAccount;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Technology> technologie;
}
