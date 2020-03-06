package pl.pawe._kaliszewski.waiter_organizer.service;

import org.springframework.stereotype.Service;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.burger.Burger;
import pl.pawe._kaliszewski.waiter_organizer.repository.BurgerRepository;

import java.util.List;

@Service
public class BurgerService {

    private final BurgerRepository burgerRepository;

    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }

    public Burger addOrder(Burger burger) {
        return burgerRepository.save(burger);
    }

    public List<Burger> getAllOrders() {
        return burgerRepository.findAll();
    }
}
