package com.jmk.wk2;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public abstract void display();
  public void setFB(FlyBehavior fb) {
    flyBehavior = fb;
  }
  public void setQB(QuackBehavior qb) {
    quackBehavior = qb;
  }
  public void performFly() {
    flyBehavior.fly();
  }
  public void performQuack() {
    quackBehavior.quack();
  }
}