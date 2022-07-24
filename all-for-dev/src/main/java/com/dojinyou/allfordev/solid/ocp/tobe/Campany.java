package com.dojinyou.allfordev.solid.ocp.tobe;

import java.util.List;

public class Campany {
  private List<Employee> employees;

  public Campany(List<Employee> employees) {
    this.employees = employees;
  }

  public void makeWork() {
    for (Employee employee : employees) {
      employee.work();
    }
  }
}
