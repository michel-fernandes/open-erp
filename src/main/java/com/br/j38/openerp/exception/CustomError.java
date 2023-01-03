package com.br.j38.openerp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomError {
    private final String userMessage;
    private final String devMessage;
}
