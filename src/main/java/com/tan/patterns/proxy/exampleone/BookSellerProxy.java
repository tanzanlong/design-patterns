package com.tan.patterns.proxy.exampleone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookSellerProxy implements Seller {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookSellerProxy.class);

    private static final int NUM_WIZARDS_ALLOWED = 3;

    private int numBooks;

    private final Seller seller;

    public BookSellerProxy(Seller seller) {
        this.seller = seller;
    }

    @Override
    public void sell(Goods goods) {
        if (numBooks < NUM_WIZARDS_ALLOWED) {
            seller.sell(goods);;
            numBooks++;
        } else {
            LOGGER.info("{} is not allowed to enter!", goods);
        }
    }
}
