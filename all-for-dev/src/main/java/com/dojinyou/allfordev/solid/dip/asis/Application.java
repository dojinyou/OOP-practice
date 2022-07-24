package com.dojinyou.allfordev.solid.dip.asis;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Application {
  private InMemoryDatabase<String> inMemoryDatabase;

  public void saveData(String data) {
    inMemoryDatabase.storeData(data);
  }

  public static void main(String[] args) {
    Application application = new Application(new InMemoryDatabase<>());
    application.saveData("data");
  }
}
