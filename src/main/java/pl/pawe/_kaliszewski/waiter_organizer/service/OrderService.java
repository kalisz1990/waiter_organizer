package pl.pawe._kaliszewski.waiter_organizer.service;

import org.springframework.stereotype.Service;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.Order;
import pl.pawe._kaliszewski.waiter_organizer.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
