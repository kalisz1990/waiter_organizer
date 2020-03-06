package pl.pawe._kaliszewski.waiter_organizer.pojo.order.menu.starter;

import javax.persistence.*;

@Entity
public class Starter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private  StarterKind starterKind;

    public Starter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StarterKind getStarterKind() {
        return starterKind;
    }

    public void setStarterKind(StarterKind starterKind) {
        this.starterKind = starterKind;
    }
}
