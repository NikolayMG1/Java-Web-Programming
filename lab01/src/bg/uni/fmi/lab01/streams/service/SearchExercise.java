package bg.uni.fmi.lab01.streams.service;

import bg.uni.fmi.lab01.streams.entity.Order;
import bg.uni.fmi.lab01.streams.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SearchExercise {

    /**
     * extract all active orders
     * @param user
     * @return List<Order>
     */
    public List<Order> getActiveOrders(User user) {
        return user.getOrders().stream().filter(Order::isActive).toList();
    }

    public List<Order> getActiveOrdersByIteration(User user) {
        List<Order> activeOrders = new ArrayList<>();
        for(Order order : user.getOrders()){
            if(order.isActive()){
                activeOrders.add(order);
            }
        }
        return activeOrders;
    }

    /**
     * Return order by a specific id
     * @param orders
     * @param orderId
     * @return Order
     */
    public Order getOrderById(List<Order> orders, long orderId) {
        Optional<Order> optionalOrder = orders.stream()
                .filter(order -> order.id() == orderId)
                .findFirst();
        return optionalOrder.orElse(null);
    }

    public Order getOrderByIdIteration(List<Order> orders, long orderId) {
        for(Order o : orders){
            if(o.id() == orderId){
                return o;
            }
        }
        return null;
    }

    /**
     * Return orders that have specific description for item
     * @param user
     * @param description
     * @return List<Order>
     */
    public List<Order> getOrdersThatHaveItemDescription(User user, String description) {

        List<Order> = user.getOrders().stream()
                .filter(item = getOrdersThatHaveItemDescription().get() == orderId);
        return optionalOrder.orElse(null);
    }

    /**
     * @return true if customer has at least one order with status ACTIVE
     */
    public boolean hasActiveOrders(User user) {
        return user.getOrders().stream()
                .anyMatch(Order::isActive);
    }

    /**
     * Return true if inside the Order we don't have OrderLine with special offer
     */
    public boolean canBeReturned(Order order) {
        return null;
    }

    /**
     * Return the order with maximum total price
     * @param user
     * @return
     */
    public Optional<Order> getMaxPriceOrder(User user) {
        return null;
    }
}