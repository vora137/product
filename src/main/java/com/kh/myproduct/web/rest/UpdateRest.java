package com.kh.myproduct.web.rest;

import lombok.Data;

@Data
public class UpdateRest {
  private Long pid;
  private String pname;
  private Long quantity;
  private Long price;
}