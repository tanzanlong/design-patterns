package com.tan.patterns.builder.exampleone;

public class Customer {
    private final String name;
    private final String age;
    private final   String rank;

    private Customer(Builder builder) {
      this.name = builder.name;
      this.age = builder.age;
      this.rank = builder.rank;
    }


    public String getName() {
      return name;
    }

    public String getAge() {
      return age;
    }

    public String getRank() {
      return rank;
    }


    /**
     * 
     * The builder class.
     * 
     */
    public static class Builder {

        private  String name;
        private  String age;
        private  String rank;

      /**
       * Constructor
       */
      public Builder(String name) {
        this.name = name;
      }

      public Builder withName(String name) {
        this.name = name;
        return this;
      }

      public Builder withAge(String age) {
        this.age = age;
        return this;
      }
      
      public Builder withRank(String rank) {
          this.rank = rank;
          return this;
        }


      public Customer build() {
        return new Customer(this);
      }
    }
}
