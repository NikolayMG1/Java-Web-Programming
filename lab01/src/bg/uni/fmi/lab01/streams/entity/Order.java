package bg.uni.fmi.lab01.streams.entity;

import bg.uni.fmi.lab01.streams.vo.OrderStatus;
import bg.uni.fmi.lab01.streams.vo.PaymentMethod;

import java.time.LocalDate;
import java.util.List;

public record Order (long id,
        List<OrderLine> list,
        LocalDate creationDate,
        double totalPrice,
        PaymentMethod paymentMethod,
        LocalDate deliveryDueDate,
        User user) {

        public boolean isActive(){
            return deliveryDueDate.isBefore(LocalDate.now());
        }
}
