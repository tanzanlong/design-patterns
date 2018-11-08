package com.tan.patterns.abstractfactory.example.restaurant;

public class FivestarRestaurant implements FoodFactory{

    @Override
    public Drink createDrink() {
        return new Tea();
    }

    @Override
    public Fruit createFruit() {
        return new Orange();
    }

    @Override
    public Cuisine createCuisine() {
        return new HunanCuisine();
    }

}
