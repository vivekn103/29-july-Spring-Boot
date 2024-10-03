package com.te.ems.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer technologyId;
    @Column(unique = true)
    private String technologyName;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "technologie")
    private List<Employee> employeeList;
}
