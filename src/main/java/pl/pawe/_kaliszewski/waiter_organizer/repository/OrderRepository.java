package pl.pawe._kaliszewski.waiter_organizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pawe._kaliszewski.waiter_organizer.pojo.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

}
