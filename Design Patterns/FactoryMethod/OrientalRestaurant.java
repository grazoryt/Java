public class OrientalRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        return new OrientalBurger();
    }
}