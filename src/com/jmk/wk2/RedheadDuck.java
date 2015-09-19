package com.jmk.wk2;

public class RedheadDuck extends Duck {
  public RedheadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Squeak();
  }
  
  public void display() {
    System.out.println("RedheadDuck");
  }
}