package com.tan.patterns.eventdriven.framework;


public interface Handler<E extends Event>{
  void onEvent(E e);
}
