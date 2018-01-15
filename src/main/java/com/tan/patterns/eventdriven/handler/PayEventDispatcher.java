package com.tan.patterns.eventdriven.handler;

import java.util.HashMap;
import java.util.Map;

import com.tan.patterns.eventdriven.framework.Event;
import com.tan.patterns.eventdriven.framework.Handler;

public class PayEventDispatcher {

    private Map<Class<? extends Event>, Handler<? extends Event>> handlerMap =
            new HashMap<Class<? extends Event>, Handler<? extends Event>>();

    public <E extends Event> void registerHandler(Class<E> eventType, Handler<E> handler) {
        handlerMap.put(eventType, handler);
    }

    public <E extends Event> void dispatcher(E e) {
        @SuppressWarnings("unchecked")
        Handler<E> handler = (Handler<E>) handlerMap.get(e.getClass());
        if (handler != null) {
            handler.onEvent(e);
        }
    }
}
