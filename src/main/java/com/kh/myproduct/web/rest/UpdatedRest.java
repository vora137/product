package com.kh.myproduct.web.rest;

import lombok.Data;

@Data
public class UpdatedRest {
  private Long productId;
  private String pname;
  private Long quantity;
  private Long price;
}