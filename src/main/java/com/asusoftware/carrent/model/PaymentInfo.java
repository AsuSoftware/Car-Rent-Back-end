package com.asusoftware.carrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    @Id @GeneratedValue
    private UUID id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "payment_type", nullable = false)
    private PaymentType paymentType;

    @NotBlank
    @Column(name = "card_number")
    private String cardNumber;

    @NotNull
    @Column(name = "expiration_month")
    private Date expirationMonth;

    @NotBlank
    @Column(name = "security_code")
    private String securityCode;

    @NotBlank
    @Column(name = "billing_post_code")
    private String billingPostCode;

    @NotBlank
    @Column(name = "billing_country")
    private String billingCountry;
}
