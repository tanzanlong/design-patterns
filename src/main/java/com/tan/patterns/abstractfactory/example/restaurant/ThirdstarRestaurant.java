package com.tan.patterns.abstractfactory.example.restaurant;

public class ThirdstarRestaurant implements FoodFactory{

    @Override
    public Drink createDrink() {
        return new Water();
    }

    @Override
    public Fruit createFruit() {
        return new Watermelon();
    }

    @Override
    public Cuisine createCuisine() {
        return new ShandongCuisine();
    }

}
