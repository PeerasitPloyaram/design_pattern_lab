package org.example.Entity;

import org.example.Observable;
import org.example.Quackable;

import java.util.Observer;

public class RedheadDuck implements Quackable {
    Observable observable;

    public void quack() {
        System.out.println("Quack");
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }


    public void notifyObservers() {
        observable.notifyObservers();
    }
}
