package com.br.j38.openerp.domain.customer.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.group.GroupSequenceProvider;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "consumers")
@GroupSequenceProvider(CustomerGroupSequenceProvider.class)
public class Customer implements Serializable{

    @Id
    private String id;
    @NotBlank(message = "Name is required")
    private String name;
    @NotNull(message = "Type of entity is required")
    private EntityType entityType;
    @NotNull(message = "Segment is required")
    private Type type;
    @NotBlank(message = "CPF or CNPJ is required")
    @CPF(groups = CpfGroup.class)
    @CNPJ(groups = CnpjGroup.class)
    private String documentNumber;
    @NotBlank(message = "Phone number is required")
    private String phone;
    @NotBlank(message = "Email is required")
    private String email;
    private LocalDateTime registrationDate;
    @NotBlank(message = "Address is required")
    private Address address;
}
