package com.te.ems.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

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
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Double salary;
}
