package com.tan.patterns.builder.exampleone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    
    /**
     * Program entry point
     * 
     * @param args command line args
     */
    public static void main(String[] args) {

        Customer mage =
          new Customer.Builder("Riobard").withAge("12").build();
      LOGGER.info(mage.toString());
    }
    
}
