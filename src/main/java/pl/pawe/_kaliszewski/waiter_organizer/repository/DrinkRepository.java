package pl.pawe._kaliszewski.waiter_organizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.drinks.Drink;

@Repository("burger_repository")
public interface DrinkRepository extends JpaRepository<Drink, Long> {
}
