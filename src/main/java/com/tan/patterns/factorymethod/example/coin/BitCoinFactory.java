package com.tan.patterns.factorymethod.example.coin;

public class BitCoinFactory implements CoinFactory{

    @Override
    public Coin manufactureCoin(CoinType coinType) {
        return new BitCoin(coinType);
    }

}
