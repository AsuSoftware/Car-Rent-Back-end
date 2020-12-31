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
 * car-rent Created by Antonio on 12/31/2020
 */

@Getter
@Setter
@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "number_of_days")
    private String number_of_days;

    @NotNull
    @Column(name = "start_date")
    private Date start_date;

    @NotNull
    @Column(name = "end_date")
    private Date end_date;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "reservation")
    private List<Post> posts;
}
