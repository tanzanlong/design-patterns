package com.tan.patterns.eventdriven.event;

import com.tan.patterns.eventdriven.model.PayRequest;

public class RechargePayEvent extends AbstractEvent{

    private PayRequest payRequest;
    
    public RechargePayEvent(PayRequest payRequest){
        this.payRequest=payRequest;
    }

    public PayRequest getPayRequest() {
        return payRequest;
    }
    
    
}
