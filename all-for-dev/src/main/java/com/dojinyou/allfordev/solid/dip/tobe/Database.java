package com.dojinyou.allfordev.solid.dip.tobe;

public interface Database<T> {
  void storeData(T data);
}
