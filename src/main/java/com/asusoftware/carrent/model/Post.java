package com.asusoftware.carrent.model;

import com.sun.istack.Nullable;
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
    @Column(name = "brand")
    private String brand;

    @NotBlank
    @Column(name = "model")
    private String model;

    @NotBlank
    @Column(name = "engine")
    private String engine;

    @NotBlank
    @Column(name = "hp")
    private String hp;

    @NotNull
    @Column(name = "fabrication")
    private Date fabrication;

    @NotNull
    @Column(name = "address")
    private Address address;

    @Nullable
    @Column(name = "description")
    private String description;

    @NotBlank
    @Column(name = "price_per_day")
    private String pricePerDay;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "post_state")
    private PostState postState;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "category")
    private PostCategory postCategory;

    @OneToMany(mappedBy = "post")
    private List<Image> images;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "reservation")
    private Reservation reservation;
}
