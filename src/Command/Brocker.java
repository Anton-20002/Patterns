package Command;

import java.util.ArrayList;
import java.util.List;

class Brocker {
  private List<Order> orderList = new ArrayList<>();

  void takeOrder(Order order) {
    orderList.add(order);
  }

  void sellOrder() {
    orderList.forEach(Order::execute);
    orderList.clear();
  }
}
