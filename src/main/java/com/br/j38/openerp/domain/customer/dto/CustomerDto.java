package com.br.j38.openerp.domain.customer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "CPF is required")
    @Size(max=11)
    private String cpf;

    @NotBlank(message = "Phone number is required")
    private String phone;

}
