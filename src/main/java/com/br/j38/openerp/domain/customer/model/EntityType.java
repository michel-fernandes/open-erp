package com.br.j38.openerp.domain.customer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EntityType {
    LEGAL_ENTITY("Jurídica", "CNPJ", "00.000.000/0000-00", CnpjGroup.class),
    NATURAL_PERSON("Física", "CPF", "000.000.000-00", CpfGroup.class);

    private final String description;
    private final String documentType;
    private final String mask;
    private final Class<?> group;

}
