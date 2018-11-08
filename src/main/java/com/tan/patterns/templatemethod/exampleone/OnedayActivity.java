package com.tan.patterns.templatemethod.exampleone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class OnedayActivity {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(OnedayActivity.class);

    protected abstract String morningRun();

    protected abstract void lunch(String target);

    protected abstract void study(String target);

    /**
     * Steal
     */
    public void activity() {
        String target = morningRun();
        LOGGER.info("The target has been chosen as {}.", target);
        lunch(target);
        study(target);
    }
}
