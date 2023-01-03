package com.br.j38.openerp.domain.customer.repository;

import com.br.j38.openerp.domain.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>, PagingAndSortingRepository<Customer, String> {
    boolean existsByDocumentNumber(String documentNumber);
}
