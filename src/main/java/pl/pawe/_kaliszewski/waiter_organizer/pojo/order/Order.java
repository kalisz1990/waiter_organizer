package pl.pawe._kaliszewski.waiter_organizer.pojo.order;

import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.Menu;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

//TODO: czy ma byc encja jesli tak to jak ??

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Min(value = 1)
    @Max(value = 10)
    @NotNull
    private int tableNumber;

    @NotNull
    private Menu menu;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
