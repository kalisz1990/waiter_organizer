package pl.pawe._kaliszewski.waiter_organizer.service;

import org.springframework.stereotype.Service;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.drinks.Drink;
import pl.pawe._kaliszewski.waiter_organizer.repository.DrinkRepository;

import java.util.List;

@Service
public class DrinkService {

    private final DrinkRepository drinkRepository;

    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public Drink addOrder(Drink drink) {
        return drinkRepository.save(drink);
    }

    public List<Drink> getAllOrders() {
        return drinkRepository.findAll();
    }
}
