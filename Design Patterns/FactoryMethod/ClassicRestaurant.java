public class ClassicRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        return new ClassicBurger();
    }
}