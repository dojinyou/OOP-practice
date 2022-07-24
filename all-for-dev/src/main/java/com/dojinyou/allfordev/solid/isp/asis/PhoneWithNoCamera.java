package com.dojinyou.allfordev.solid.isp.asis;

public class PhoneWithNoCamera implements Smartphone {
  @Override
  public void call(String phoneNumber) {
    
  }

  @Override
  public void sendMessage(String message) {

  }

  @Override
  public String seeYoutube() {
    return null;
  }

  @Override
  public String takePicture() {
    return null; // Fixme: 불필요한 함수
  }
}
