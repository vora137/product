package com.kh.myproduct.svc;

import com.kh.myproduct.dao.Product;

import java.util.List;
import java.util.Optional;

public interface ProductSVC {
  // 등록
  Long save(Product product);

  // 조회
  Optional<Product> findById(Long pid);

  // 수정
  int update(Long pid, Product product);

  // 삭제
  int delete(Long pid);

  // 목록 List:인터페이스
  List<Product> findAll();
}
