package org.eod940.cafekiosk.unit.beverage;

public class Americano implements Beverage {

  @Override
  public Integer getPrice() {
    return 4_000;
  }

  @Override
  public String getName() {
    return "아메리카노";
  }
}
