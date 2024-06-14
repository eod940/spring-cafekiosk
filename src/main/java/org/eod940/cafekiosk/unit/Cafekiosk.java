package org.eod940.cafekiosk.unit;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.eod940.cafekiosk.unit.beverage.Beverage;
import org.eod940.cafekiosk.unit.order.Order;

@Getter
public class Cafekiosk {

  private final List<Beverage> orderList = new ArrayList<>();

  public void add(Beverage beverage) {
    orderList.add(beverage);
  }

  public void delete(Beverage beverage) {
    orderList.remove(beverage);
  }

  public void clear() {
    orderList.clear();
  }

  public Integer calculateTotalPrice() {
    Integer totalPrice = 0;
    for (Beverage beverage : orderList) {
      totalPrice += beverage.getPrice();
    }
    return totalPrice;
  }

  public Order createOrder() {
    return new Order(LocalDateTime.now(), orderList);
  }
}
