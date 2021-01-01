package com.asusoftware.carrent.model.dto;

import com.asusoftware.carrent.model.PaymentInfo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * car-rent Created by Antonio on 12/31/2020
 */

@Getter
@Setter
public class CreateUserDto {
   @NotBlank private String firstName;
   @NotBlank private String lastName;
   @JsonFormat(pattern="yyyy-MM-dd")
   @NotNull private Date birthday;
   @Email @NotNull private String email;
   @NotNull private String phone;
   @NotBlank private String password;
   @NotNull private AddressDto address;
   @NotNull private PaymentInfo paymentInfo;
}
