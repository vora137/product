package com.kh.myproduct.web.form;

import lombok.Data;

@Data
public class DetailForm {
  private Long pid;
  private String pname;
  private Long quantity;
  private Long price;
}
