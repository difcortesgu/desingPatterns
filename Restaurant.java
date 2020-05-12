import RestaurantFactory.RestaurantAbstractFactory;
import RestaurantFactory.RestaurantFactoryProducer;

public class Restaurant {
    public static void main(String[] args) {
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        RestaurantAbstractFactory restaurantAbstractFactory = restaurantFactoryProducer.getRestaurantAbstractFactory(1);
        System.out.println(restaurantAbstractFactory.getFastFood("hamburguer"));
    }    
}