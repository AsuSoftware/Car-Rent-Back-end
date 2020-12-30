package com.asusoftware.carrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/29/2020
 */

@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "car_brand")
    private String carBrand;

    @NotBlank
    @Column(name = "car_model")
    private String carModel;

    @NotBlank
    @Column(name = "car_engine")
    private String engine;

    @NotBlank
    @Column(name = "hp")
    private String hp;

    @NotNull
    @Column(name = "car_fabrication")
    private Date carFabrication;

    @NotNull
    @Column(name = "address")
    private Address address;

    @OneToMany(mappedBy = "post")
    private List<Image> images;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
