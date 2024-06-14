package org.eod940.cafekiosk.unit.beverage;

public class Latte implements Beverage {

  @Override
  public Integer getPrice() {
    return 4_500;
  }

  @Override
  public String getName() {
    return "라떼";
  }
}
