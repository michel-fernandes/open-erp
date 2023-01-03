package com.br.j38.openerp.domain.customer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    private String addressLineOne;
    private String addressLineTwo;
    private String addressLineThree;
    private String country;
    private String state;
    private String city;
    private String postalCode;
}
