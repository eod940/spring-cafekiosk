package org.eod940.cafekiosk.unit.order;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.eod940.cafekiosk.unit.beverage.Beverage;

@Getter
@RequiredArgsConstructor
public class Order {

  private final LocalDateTime orderDate;
  private final List<Beverage> beverages;

}
