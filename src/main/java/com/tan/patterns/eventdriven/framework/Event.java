package com.tan.patterns.eventdriven.framework;

public interface Event {

    public Class<? extends Event> getType();
}
