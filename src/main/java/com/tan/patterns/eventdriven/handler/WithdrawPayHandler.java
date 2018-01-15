package com.tan.patterns.eventdriven.handler;

import com.tan.patterns.eventdriven.event.WithdrawPayEvent;
import com.tan.patterns.eventdriven.framework.Handler;

public class WithdrawPayHandler implements Handler<WithdrawPayEvent> {
    @Override
    public void onEvent(WithdrawPayEvent e) {
        
    }
 
}
