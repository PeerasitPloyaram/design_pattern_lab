package org.example;

import java.util.Observer;

public class QuackEcho implements Quackable{
    Observable observable;
    Quackable duck;

    public QuackEcho(Quackable duck){
        this.duck = duck;
    }
    public void quack(){
        duck.quack();
        System.out.print("Echo :");
        duck.quack();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }


    public void notifyObservers() {
        observable.notifyObservers();
    }
}
