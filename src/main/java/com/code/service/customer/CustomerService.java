package com.code.service.customer;

import java.util.Optional;
import com.code.model.Customer;
import com.code.model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.code.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {

  @Autowired
  private ICustomerRepository customerRepository;

  @Override
  public Iterable<Customer> findAll() {
    return customerRepository.findAll();
  }

  @Override
  public Optional<Customer> findById(Long id) {
    return customerRepository.findById(id);
  }

  @Override
  public void save(Customer customer) {
    customerRepository.save(customer);
  }

  @Override
  public void remove(Long id) {
    customerRepository.deleteById(id);
  }

  @Override
  public Iterable<Customer> findAllByProvince(Province province) {
    return customerRepository.findAllByProvince(province);
  }
}
