package pl.pawe._kaliszewski.waiter_organizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.burger.Burger;

@Repository("burger_repository")
public interface BurgerRepository extends JpaRepository<Burger, Long> {
}
