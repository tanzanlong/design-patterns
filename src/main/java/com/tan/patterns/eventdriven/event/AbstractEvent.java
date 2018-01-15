package com.tan.patterns.eventdriven.event;

import com.tan.patterns.eventdriven.framework.Event;

public abstract class AbstractEvent implements Event {

    @Override
    public Class<? extends Event> getType() {
        return getClass();
    }

}
