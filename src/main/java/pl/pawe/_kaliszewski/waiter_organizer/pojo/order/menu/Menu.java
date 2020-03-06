package pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu;

import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.burger.Burger;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.drinks.Drink;
import pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.starter.Starter;

import java.util.List;

public class Menu {

    private List<Drink> drink;

    private List<Starter> starters;

    private List<Burger> burgers;

    public List<Drink> getDrink() {
        return drink;
    }

    public void setDrink(List<Drink> drink) {
        this.drink = drink;
    }

    public List<Starter> getStarters() {
        return starters;
    }

    public void setStarters(List<Starter> starters) {
        this.starters = starters;
    }

    public List<Burger> getBurgers() {
        return burgers;
    }

    public void setBurgers(List<Burger> burgers) {
        this.burgers = burgers;
    }
}
