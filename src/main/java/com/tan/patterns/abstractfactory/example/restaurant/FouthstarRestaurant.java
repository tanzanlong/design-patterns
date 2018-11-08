package com.tan.patterns.abstractfactory.example.restaurant;

public class FouthstarRestaurant implements FoodFactory{

    @Override
    public Drink createDrink() {
        return new Wine();
    }

    @Override
    public Fruit createFruit() {
        return new Kiwifruit();
    }

    @Override
    public Cuisine createCuisine() {
        return new SichuanCuisine();
    }

}
