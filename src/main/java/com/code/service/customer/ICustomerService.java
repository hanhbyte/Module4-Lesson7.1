package com.code.service.customer;

import com.code.model.Customer;
import com.code.model.Province;
import com.code.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
  Iterable<Customer> findAllByProvince(Province province);
}
