package pl.pawe._kaliszewski.waiter_organizer.pojo;

import org.hibernate.annotations.GenericGenerator;
import pl.pawe._kaliszewski.waiter_organizer.pojo.menu.Menu;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class Order {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Min(value = 1)
    @Max(value = 10)
    @NotNull
    private int tableNumber;

    private Menu menu;

}
