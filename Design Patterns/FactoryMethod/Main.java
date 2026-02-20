public class Main {

    public static void main(String[] args) {

        Restaurant oriental = new OrientalRestaurant();
        oriental.orderBurger();

        Restaurant classic = new ClassicRestaurant();
        classic.orderBurger();
    }
}