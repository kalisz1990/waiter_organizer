package pl.pawe._kaliszewski.waiter_organizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.Order;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.burger.Burger;
import pl.pawe._kaliszewski.waiter_organizer.service.BurgerService;
import pl.pawe._kaliszewski.waiter_organizer.service.OrderService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order/menu/burger")
public class BurgerController {

    private final BurgerService burgerService;

    @Autowired
    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    @PostMapping
    public Burger addOrder(@RequestBody @Valid Burger burger){
        return burgerService.addOrder(burger);
    }

    @GetMapping()
    public List<Burger> getAll(){
        return burgerService.getAllOrders();
    }

}
