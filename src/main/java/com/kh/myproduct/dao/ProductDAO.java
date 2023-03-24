package com.kh.myproduct.dao;

import java.util.List;
import java.util.Optional;

public interface ProductDAO {
  /**
   * 등록
   * @param product
   * @return
   */
  Long save(Product product);

  /**
   * 조회
   *
   * @param pid
   * @return
   */
  Optional<Product> findById(Long pid);


  /**
   * 수정
   * @param pid
   * @param product
   * @return
   */
  int update(Long pid, Product product);

  /**
   * 삭제
   * @param pid
   * @return
   */
  int delete(Long pid);

  /**
   * 목록
   * @return
   */
  List<Product> findAll();
}
