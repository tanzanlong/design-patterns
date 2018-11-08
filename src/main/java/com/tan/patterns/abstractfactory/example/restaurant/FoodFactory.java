package com.tan.patterns.abstractfactory.example.restaurant;

public interface FoodFactory {

    Drink createDrink();

    Fruit createFruit();

    Cuisine createCuisine();

}
