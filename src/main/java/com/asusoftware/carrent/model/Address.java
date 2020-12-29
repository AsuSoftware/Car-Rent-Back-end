package com.asusoftware.carrent.model;

import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/29/2020
 */
@Getter
@Setter
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    @Nullable
    @Column(name = "city")
    private String city;

    @Nullable
    @Column(name = "country")
    private String country;

    @Nullable
    @Column(name = "zip")
    private String zip;

    @Nullable
    @Column(name = "street")
    private String street;

    @Nullable
    @Column(name = "street_number")
    private String streetNumber;

    @Nullable
    @Column(name = "details")
    private String details;
}
