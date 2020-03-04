package pl.pawe._kaliszewski.waiter_organizer.pojo.menu.drinks;

public class Drink {

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
