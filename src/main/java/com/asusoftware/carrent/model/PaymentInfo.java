package com.asusoftware.carrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/29/2020
 */

@Getter
@Setter
@Entity
@Table(name = "payments")
public class PaymentInfo {
    private UUID id;
    private PaymentType paymentType;
    private String cardNumber;
    private Date expirationMonth;
    private String securityCode;
    private String billingPostCode;
    private String billingCountry;
}
