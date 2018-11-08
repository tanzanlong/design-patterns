package com.tan.patterns.templatemethod.exampleone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TonyTanOneDayActivity extends OnedayActivity{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TonyTanOneDayActivity.class);
    @Override
    protected String morningRun() {
        LOGGER.info(" ..run to pazhou... ");
        return "pazhou";
    }

    @Override
    protected void lunch(String target) {
        LOGGER.info(" eat something");
    }

    @Override
    protected void study(String target) {
        LOGGER.info(" study program");
        
    }

}
