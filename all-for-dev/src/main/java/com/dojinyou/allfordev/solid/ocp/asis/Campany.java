package com.dojinyou.allfordev.solid.ocp.asis;

import java.util.List;

import com.dojinyou.allfordev.solid.srp.Analyst;


// TODO: AS-IS
public class Campany<T> {
  private List<T> employees;

  public Campany(List<T> employees) {
    this.employees = employees;
  }

  public void makeWork() {
    for (T employee: employees) {
      if (employee.getClass() == Developer.class) {
        ((Developer)employee).coding();
      }
      else if (employee.getClass() == Designer.class) {
        ((Designer)employee).design();
      }
      else if (employee.getClass() == Analyst.class) {
        ((Analyst)employee).analyze();
      }
    }
  }
}
