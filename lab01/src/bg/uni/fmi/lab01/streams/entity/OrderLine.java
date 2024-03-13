package bg.uni.fmi.lab01.streams.entity;

import bg.uni.fmi.lab01.streams.entity.Item;

import java.math.BigDecimal;

public class OrderLine extends Item {

    int quantity;
    boolean specialOffer;

    OrderLine(String name, String description, BigDecimal price, int quantity, boolean specialOffer) {
        super(name, description, price);
        this.quantity = quantity;
        this.specialOffer = specialOffer;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(boolean specialOffer) {
        this.specialOffer = specialOffer;
    }

    public int getQuantity() {
        return quantity;
    }
}
