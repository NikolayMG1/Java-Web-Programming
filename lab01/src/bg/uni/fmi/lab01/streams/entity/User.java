package bg.uni.fmi.lab01.streams.entity;
import java.util.List;

public class User {
    List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
