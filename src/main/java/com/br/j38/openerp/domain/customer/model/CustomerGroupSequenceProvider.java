package com.br.j38.openerp.domain.customer.model;

import org.hibernate.validator.spi.group.DefaultGroupSequenceProvider;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroupSequenceProvider implements DefaultGroupSequenceProvider<Customer> {


    @Override
    public List<Class<?>> getValidationGroups(Customer customer) {
        List<Class<?>> groups = new ArrayList<>();
        groups.add(Customer.class);

        if(isEntityTypeSelected(customer)){
            groups.add(customer.getEntityType().getGroup());
        }

        return groups;
    }

    private boolean isEntityTypeSelected(Customer customer) {
        return customer != null && customer.getEntityType() != null;
    }
}
