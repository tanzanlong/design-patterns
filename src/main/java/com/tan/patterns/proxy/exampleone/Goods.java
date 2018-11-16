package com.tan.patterns.proxy.exampleone;

public class Goods {

    private final String name;

    public Goods(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name;
    }
}
