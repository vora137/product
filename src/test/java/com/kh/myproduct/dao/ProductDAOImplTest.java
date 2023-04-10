package com.kh.myproduct.dao;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Slf4j
@SpringBootTest
public class ProductDAOImplTest {
  @Autowired
  ProductDAO productDAO;

  @Test
  @DisplayName("상품등록")
  void save() {
    Product product = new Product();
    product.setPname("상품등록테스트");
    product.setQuantity(10L);
    product.setPrice(500000L);

    Long pid = productDAO.save(product);
    log.info("pid={}",pid);
    Assertions.assertThat(pid).isGreaterThan(0L);
  }

  @Test
  @DisplayName("상품조회")
  void findById() {
    Long pid = 41L;
    Optional<Product> product = productDAO.findById(pid);

    Product findProduct = product.orElseThrow();
    Assertions.assertThat(findProduct.getPname()).isEqualTo("상품등록테스트");
    Assertions.assertThat(findProduct.getQuantity()).isEqualTo(10L);
    Assertions.assertThat(findProduct.getPrice()).isEqualTo(500000L);

  }

  @Test
  @DisplayName("상품수정")
  void update() {
    Long pid = 41L;
    Product product = new Product();
    product.setPname("상품등록테스트 수정");
    product.setQuantity(20L);
    product.setPrice(300000L);
    int updateCount = productDAO.update(pid,product);
    Optional<Product> findProduct = productDAO.findById(pid);

    Assertions.assertThat(updateCount).isEqualTo(1);
    Assertions.assertThat(findProduct.get().getPname()).isEqualTo(product.getPname());
    Assertions.assertThat(findProduct.get().getQuantity()).isEqualTo(product.getQuantity());
    Assertions.assertThat(findProduct.get().getPrice()).isEqualTo(product.getPrice());
  }

  @Test
  @DisplayName("상품삭제")
  void delete() {
    Long Pid = 41L;
    int deleteCount = productDAO.delete(Pid);
    Optional<Product> findProduct = productDAO.findById(Pid);

    Assertions.assertThatThrownBy(()->findProduct.orElseThrow())
        .isInstanceOf(NoSuchElementException.class);
  }

  @Test
  @DisplayName("상품목록")
  void findAll() {
    List<Product> list = productDAO.findAll();
    Assertions.assertThat(list.size()).isGreaterThan(0);
  }
}