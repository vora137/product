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
   * 전체 삭제
   * @return
   */
  int deleteAll();

  /**
   * 상품존재 유무
   * @param pid 상품아이디
   * @return
   */
  boolean isExist(Long pid);

  /**
   * 목록
   * @return
   */
  List<Product> findAll();

  /**
   * 등록된 상품 수
   * @return
   */
  int countOfRecord();
}
