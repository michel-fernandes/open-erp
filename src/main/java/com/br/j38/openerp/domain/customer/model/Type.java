package com.br.j38.openerp.domain.customer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Type {
    VIP("Platinum"),
    GOLD("Gold"),
    SILVER("Silver"),
    MASS("Mass");
    private final String description;
}
