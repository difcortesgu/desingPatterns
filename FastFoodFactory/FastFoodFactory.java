package FastFoodFactory;

public class FastFoodFactory {
    public FastFood getFastFood(String type) {
        switch (type) {
            case "hamburger":
                return new Hamburger();

            case "sandwich":
                return new Sandwich();
            case "hot dog":
                return new HotDog();
            default:
                return null;
        }
    }
}