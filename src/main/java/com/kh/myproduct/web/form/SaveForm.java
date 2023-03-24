package com.kh.myproduct.web.form;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class SaveForm {
  @NotBlank // null 허용안함, 문자열타입에만 사용
  private String pname;

  @NotNull  // null 허용안함
  @Positive // 양수
  private Long quantity;

  @NotNull
  @Positive
  @Min(1000)  //최소값
  private Long price;
}
