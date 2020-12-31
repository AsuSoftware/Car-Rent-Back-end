package com.asusoftware.carrent.model.dto;

import com.asusoftware.carrent.model.Address;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * car-rent Created by Antonio on 12/31/2020
 */
@Getter
@Setter
public class AddressDto {
    @NotBlank
    private String city;
    @NotBlank private String country;
    @NotBlank private String zip;
    @NotBlank private String street;
    @NotBlank private String streetNumber;
    @NotBlank private String details;

    public Address toAddress() {
        Address address = new Address();
        address.setCity(city);
        address.setCountry(country);
        address.setStreet(street);
        address.setStreetNumber(streetNumber);
        address.setDetails(details);
        address.setZip(zip);
        return address;
    }

    public static AddressDto mapFromEntity(Address address) {
        AddressDto addressDto = new AddressDto();
        addressDto.setCity(address.getCity());
        addressDto.setCountry(address.getCountry());
        addressDto.setZip(address.getZip());
        addressDto.setStreet(address.getStreet());
        addressDto.setStreetNumber(address.getStreetNumber());
        addressDto.setDetails(address.getDetails());
        return addressDto;
    }
}
