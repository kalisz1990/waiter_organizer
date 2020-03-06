package pl.pawe._kaliszewski.waiter_organizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.drinks.Drink;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.starter.Starter;
import pl.pawe._kaliszewski.waiter_organizer.service.DrinkService;
import pl.pawe._kaliszewski.waiter_organizer.service.StarterService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order/menu/starter")
public class StarterController {

    private final StarterService starterService;

    @Autowired
    public StarterController(StarterService starterService) {
        this.starterService = starterService;
    }

    @PostMapping
    public Starter addOrder(@RequestBody @Valid Starter starter){
        return starterService.addOrder(starter);
    }

    @GetMapping()
    public List<Starter> getAll(){
        return starterService.getAllOrders();
    }

}
