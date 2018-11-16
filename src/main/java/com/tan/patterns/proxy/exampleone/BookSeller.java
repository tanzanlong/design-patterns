package com.tan.patterns.proxy.exampleone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BookSeller implements Seller {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(BookSeller.class);

    @Override
    public void sell(Goods goods) {
        
        LOGGER.info(" sell book :{} ",goods.toString());

    }

}
