package RestaurantFactory;

import DrinkFactory.Drink;
import FastFoodFactory.FastFood;

public abstract class RestaurantAbstractFactory {
    public abstract FastFood getFastFood(String type);

    public abstract Drink getDrink(String type);
}