package com.dojinyou.allfordev.solid.dip.tobe;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Application {
  private Database<String> database;

  public void saveData(String data) {
    database.storeData(data);
  }

  public static void main(String[] args) {
    Application application = new Application(new InmemoryDatabase<>());
    application.saveData("data");
  }
}
