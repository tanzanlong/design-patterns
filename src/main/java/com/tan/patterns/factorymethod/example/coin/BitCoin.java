package com.tan.patterns.factorymethod.example.coin;

public class BitCoin implements Coin{
    private CoinType coinType;

    public BitCoin(CoinType coinType) {
      this.coinType = coinType;
    }

    @Override
    public String toString() {
      return "Elven " + coinType;
    }

    @Override
    public CoinType getCoinType() {
      return coinType;
    }
}
