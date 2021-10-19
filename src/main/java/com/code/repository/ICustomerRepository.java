package com.code.repository;

import com.code.model.Customer;
import com.code.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {

  Iterable<Customer> findAllByProvince(Province province);
}
