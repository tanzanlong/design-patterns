package com.tan.patterns.factorymethod.example.coin;

public interface  CoinFactory {
    
     Coin manufactureCoin(CoinType coinType);
    
}
