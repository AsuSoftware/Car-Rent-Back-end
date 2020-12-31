package com.asusoftware.carrent.model.dto;

import com.asusoftware.carrent.model.PaymentInfo;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * car-rent Created by Antonio on 12/31/2020
 */

@Getter
@Setter
public class UpdateUserDto {

    @NotBlank
    private String firstName;
    @NotBlank private String lastName;
    @Email
    @NotNull
    private String email;
    @NotBlank private String phone;
    @NotNull private AddressDto address;
    @NotNull private PaymentInfo paymentInfo;
}
