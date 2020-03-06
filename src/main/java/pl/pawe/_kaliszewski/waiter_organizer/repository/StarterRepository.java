package pl.pawe._kaliszewski.waiter_organizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.starter.Starter;

@Repository("burger_repository")
public interface StarterRepository extends JpaRepository<Starter, Long> {
}
