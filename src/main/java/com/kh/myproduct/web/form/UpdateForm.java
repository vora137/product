package com.kh.myproduct.web.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateForm {
  private Long pid;
  @NotBlank
  private String pname;
  @NotNull
  @Positive
  private Long quantity;
  @NotNull
  @Positive
  private Long price;
}
