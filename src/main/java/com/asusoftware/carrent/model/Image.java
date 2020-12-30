package com.asusoftware.carrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/30/2020
 */

@Getter
@Setter
@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    private String value;

    @ManyToOne
    @JoinColumn(name="post_id", nullable=false)
    private Post post;
}
