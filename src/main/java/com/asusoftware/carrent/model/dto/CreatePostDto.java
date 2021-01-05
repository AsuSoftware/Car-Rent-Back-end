package com.asusoftware.carrent.model.dto;

import com.asusoftware.carrent.model.PostCategory;
import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * car-rent Created by Antonio on 12/31/2020
 */

@Getter
@Setter
public class CreatePostDto {

    @NotBlank private String brand;
    @NotBlank private String model;
    @NotBlank private String engine;
    @NotBlank private String hp;
    @NotNull private Date fabrication;
    @NotNull private AddressDto address;
    @Nullable private String description;
    @NotBlank private String pricePerDay;
    @NotNull private PostCategory postCategory;
    @NotNull private List<String> images;

}
