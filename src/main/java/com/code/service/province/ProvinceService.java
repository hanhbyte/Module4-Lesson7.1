package com.code.service.province;

import java.util.Optional;
import com.code.model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.code.repository.IProvinceRepository;

@Service
public class ProvinceService implements IProvinceService{
  @Autowired
  private IProvinceRepository provinceRepository;
  @Override
  public Iterable<Province> findAll() {
    return provinceRepository.findAll();
  }

  @Override
  public Optional<Province> findById(Long id) {
    return provinceRepository.findById(id);
  }

  @Override
  public void save(Province province) {
    provinceRepository.save(province);
  }

  @Override
  public void remove(Long id) {
    provinceRepository.deleteById(id);
  }
}
