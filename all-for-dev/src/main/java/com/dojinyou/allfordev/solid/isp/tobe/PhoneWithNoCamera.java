package com.dojinyou.allfordev.solid.isp.tobe;

public class PhoneWithNoCamera implements Telephone, Application {
  @Override
  public String seeYoutube() {
    return null;
  }

  @Override
  public void call(String phoneNumber) {

  }

  @Override
  public void sendMessage(String message) {

  }
}
