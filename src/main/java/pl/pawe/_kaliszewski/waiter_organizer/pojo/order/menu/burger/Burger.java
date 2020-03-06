package pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.burger;

import javax.persistence.*;

@Entity
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private BurgerKind burgerKind;

    public Burger() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BurgerKind getBurgerKind() {
        return burgerKind;
    }

    public void setBurgerKind(BurgerKind burgerKind) {
        this.burgerKind = burgerKind;
    }
}
