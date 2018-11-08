package com.tan.patterns.factorymethod.example.coin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    private final CoinFactory coinFactory;
    
    public App(CoinFactory coinFactory) {
        this.coinFactory = coinFactory;
      }
    
    
    private void manufactureWeapons() {
        Coin coin;
        coin = coinFactory.manufactureCoin(CoinType.BITCOIN);
        LOGGER.info(coin.toString());
        coin = coinFactory.manufactureCoin(CoinType.LAITECOIN);
        LOGGER.info(coin.toString());
      }
    
    public static void main(String[] args) {
        App app = new App(new BitCoinFactory());
        app.manufactureWeapons();
        
    }
}
