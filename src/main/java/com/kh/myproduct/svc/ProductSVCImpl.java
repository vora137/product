package com.kh.myproduct.svc;

import com.kh.myproduct.dao.Product;
import com.kh.myproduct.dao.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductSVCImpl implements ProductSVC {

  private final ProductDAO productDAO;
  @Override
  public Long save(Product product) {
    return productDAO.save(product);
  }

  @Override
  public Optional<Product> findById(Long pid) {
    return productDAO.findById(pid);
  }

  @Override
  public int update(Long pid, Product product) {
    return productDAO.update(pid,product);
  }

  @Override
  public int delete(Long pid) {
    return 0;
  }

  @Override
  public List<Product> findAll() {
    return null;
  }
}
