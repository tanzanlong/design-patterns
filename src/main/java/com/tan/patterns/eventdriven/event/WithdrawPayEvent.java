package com.tan.patterns.eventdriven.event;

import com.tan.patterns.eventdriven.model.PayRequest;

public class WithdrawPayEvent extends AbstractEvent{

    private PayRequest payRequest;
    
    public WithdrawPayEvent(PayRequest payRequest){
        this.payRequest=payRequest;
    }

    public PayRequest getPayRequest() {
        return payRequest;
    }
    
    
}
