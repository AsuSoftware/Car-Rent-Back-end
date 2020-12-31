package com.asusoftware.carrent.model.dto;

import com.asusoftware.carrent.model.PaymentInfo;
import com.asusoftware.carrent.model.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/31/2020
 */

@Getter
@Setter
public class UserDto {

    private UUID id;
    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @Email @NotNull private String email;
    @NotBlank private String phone;
    @NotNull private AddressDto address;
    @NotNull private PaymentInfo paymentInfo;

    public static UserDto mapFromEntity(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPhone(user.getPhone());
        userDto.setAddress(AddressDto.mapFromEntity(user.getAddress()));
        return userDto;
    }
}
