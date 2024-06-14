package org.eod940.cafekiosk.unit;

import org.eod940.cafekiosk.unit.beverage.Americano;
import org.junit.jupiter.api.Test;

class CafekioskTest {

  @Test
  void add() {
    // Given
    Cafekiosk cafekiosk = new Cafekiosk();

    // When
    cafekiosk.add(new Americano());

    // Then
    System.out.println(">>> 담긴 음료 수: " + cafekiosk.getOrderList().size());
    System.out.println(">>> 담긴 음료: " + cafekiosk.getOrderList().get(0).getName());
  }

}