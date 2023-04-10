package com.kh.myproduct.web.form;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SaveForm {
  @NotBlank // null 허용안함, 문자열타입에만 사용
  @Size(min = 2)
  private String pname;

  @NotNull  // null 허용안함
  @Positive // 양수
  private Long quantity;

  @NotNull
  @Positive
  @Min(1000)  //최소값
  private Long price;
}
