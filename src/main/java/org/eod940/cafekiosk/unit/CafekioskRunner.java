package org.eod940.cafekiosk.unit;

import org.eod940.cafekiosk.unit.beverage.Americano;
import org.eod940.cafekiosk.unit.beverage.Latte;

public class CafekioskRunner {

  public static void main(String[] args) {
    Cafekiosk cafekiosk = new Cafekiosk();

    cafekiosk.add(new Americano());
    System.out.println(">>> 아메리카노 추가");

    cafekiosk.add(new Latte());
    System.out.println(">>> 라떼 추가");

    Integer price = cafekiosk.calculateTotalPrice();
    System.out.println("총 주문 가격: " + price);

  }

}
