package pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.drinks;

import javax.persistence.*;

@Entity
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private ColdDrinks coldDrinks;

    private HotDrinks hotDrinks;

    private Alcohol alcohol;

    public Drink() {
    }

    public ColdDrinks getColdDrinks() {
        return coldDrinks;
    }

    public void setColdDrinks(ColdDrinks coldDrinks) {
        this.coldDrinks = coldDrinks;
    }

    public HotDrinks getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrinks(HotDrinks hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }
}
