package pl.pawe._kaliszewski.waiter_organizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.burger.Burger;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.drinks.Drink;
import pl.pawe._kaliszewski.waiter_organizer.service.BurgerService;
import pl.pawe._kaliszewski.waiter_organizer.service.DrinkService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order/menu/drink")
public class DrinkController {

    private final DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @PostMapping
    public Drink addOrder(@RequestBody @Valid Drink drink){
        return drinkService.addOrder(drink);
    }

    @GetMapping()
    public List<Drink> getAll(){
        return drinkService.getAllOrders();
    }

}
