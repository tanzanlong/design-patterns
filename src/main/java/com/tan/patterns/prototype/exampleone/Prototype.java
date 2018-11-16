package com.tan.patterns.prototype.exampleone;

public abstract class Prototype implements Cloneable {
    
    public abstract Object copy() throws CloneNotSupportedException;
    
}
