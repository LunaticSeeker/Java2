package com.jmk.wk2;

public class DuckSimulator {
  public static void main(String[] args) {
    Duck md = new MallardDuck();
    md.performFly();
    md.performQuack();
    System.out.println();
    
    Duck rd = new RubberDuck();
    rd.performFly();
    rd.performQuack();
    System.out.println();
    
    md.setFB(new FlyWithRocket());
    md.performFly();
  }
}