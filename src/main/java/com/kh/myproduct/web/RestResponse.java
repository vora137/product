package com.kh.myproduct.web;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestResponse<T> {
  private Header header;
  private T data;
  @Data
  @AllArgsConstructor
  public static class Header{
    private String rtcd;
    private String rtmsg;
  }

  // 제너릭 메소드
  public static <T> RestResponse<T> createRestResponse(String rtcd, String rtmsg, T data){
    return new RestResponse<>(new Header(rtcd,rtmsg),data);
  }
}
