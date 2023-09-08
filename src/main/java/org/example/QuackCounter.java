package org.example;

import java.util.Observer;

public class QuackCounter implements Quackable{
    Observable observable;
    Quackable duck;
    static int numberOFQuacks;

    public QuackCounter(Quackable duck){
        this.duck = duck;
    }

    public void quack(){
        duck.quack();
        numberOFQuacks++;
    }

    public static int getQuack(){
        return numberOFQuacks;
    }
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }


    public void notifyObservers() {
        observable.notifyObservers();
    }
}
