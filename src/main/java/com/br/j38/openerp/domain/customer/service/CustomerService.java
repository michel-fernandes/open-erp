package com.br.j38.openerp.domain.customer.service;

import com.br.j38.openerp.domain.customer.model.Customer;
import com.br.j38.openerp.domain.customer.repository.CustomerRepository;
import com.br.j38.openerp.exception.BusinessRulesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer create(Customer customer){
        if(existsByDocumentNumber(customer.getDocumentNumber()))
            throw new BusinessRulesException(
                    String.format("Document number %s is already in use!", customer.getDocumentNumber()));
        return customerRepository.save(customer);
    }

    private boolean existsByDocumentNumber(String docNumber){
        return customerRepository.existsByDocumentNumber(docNumber);
    }

    /*public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Page<Customer> getPage(Integer limit, Integer offset) {
        return customerRepository.findAll(PageRequest.of(offset, limit));
    }*/

}
