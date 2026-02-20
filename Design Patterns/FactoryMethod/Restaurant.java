public abstract class Restaurant {

    public Burger orderBurger() {
        Burger burger = createBurger();   // factory method call
        burger.prepare();
        return burger;
    }

    protected abstract Burger createBurger();
}