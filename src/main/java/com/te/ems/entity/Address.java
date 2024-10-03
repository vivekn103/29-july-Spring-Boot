package com.te.ems.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String country;
    private String state;
    private String city;

    @Enumerated
    private AddressType addressType;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Employee employee;

}
