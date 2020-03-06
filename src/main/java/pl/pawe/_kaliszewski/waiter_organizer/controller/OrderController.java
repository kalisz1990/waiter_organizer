package pl.pawe._kaliszewski.waiter_organizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.Order;
import pl.pawe._kaliszewski.waiter_organizer.service.OrderService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order addOrder(@RequestBody @Valid Order order){
        return orderService.addOrder(order);
    }

    @GetMapping("/all_orders")
    public List<Order> getAll(){
        return orderService.getAllOrders();
    }

}
