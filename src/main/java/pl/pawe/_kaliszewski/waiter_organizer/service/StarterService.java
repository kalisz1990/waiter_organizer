package pl.pawe._kaliszewski.waiter_organizer.service;

import org.springframework.stereotype.Service;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.burger.Burger;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.starter.Starter;
import pl.pawe._kaliszewski.waiter_organizer.repository.BurgerRepository;
import pl.pawe._kaliszewski.waiter_organizer.repository.StarterRepository;

import java.util.List;

@Service
public class StarterService {

    private final StarterRepository starterRepository;

    public StarterService(StarterRepository starterRepository) {
        this.starterRepository = starterRepository;
    }

    public Starter addOrder(Starter starter) {
        return starterRepository.save(starter);
    }

    public List<Starter> getAllOrders() {
        return starterRepository.findAll();
    }
}
