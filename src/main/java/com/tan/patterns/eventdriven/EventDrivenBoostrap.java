package com.tan.patterns.eventdriven;

import com.tan.patterns.eventdriven.event.RechargePayEvent;
import com.tan.patterns.eventdriven.event.WithdrawPayEvent;
import com.tan.patterns.eventdriven.handler.PayEventDispatcher;
import com.tan.patterns.eventdriven.handler.RechargePayHandler;
import com.tan.patterns.eventdriven.handler.WithdrawPayHandler;
import com.tan.patterns.eventdriven.model.PayRequest;

public class EventDrivenBoostrap {
  public static void main(String[] args) {
     RechargePayHandler rechargePayHandler=new RechargePayHandler();
     WithdrawPayHandler withdrawPayHandler=new WithdrawPayHandler();
     PayEventDispatcher payEventDispatcher=new PayEventDispatcher();
     payEventDispatcher.registerHandler(RechargePayEvent.class, rechargePayHandler);
     payEventDispatcher.registerHandler(WithdrawPayEvent.class, withdrawPayHandler);
     PayRequest payRequest=new PayRequest();
     payRequest.setAccountId(12222L);
     payEventDispatcher.dispatcher(new RechargePayEvent(payRequest));
     payEventDispatcher.dispatcher(new WithdrawPayEvent(payRequest));
}
}
