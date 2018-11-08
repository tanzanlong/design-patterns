package com.tan.patterns.factorymethod.example.coin;

public enum CoinType {
    BITCOIN("BIT COIN"), LAITECOIN("LAITE COIN"), HUCOIN("HU COIN"), TANCOIN("");

    private String title;

    CoinType(String title) {
      this.title = title;
    }

    @Override
    public String toString() {
      return title;
    }
}
