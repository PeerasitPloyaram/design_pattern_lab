package org.example.Entity;

import org.example.Observable;
import org.example.Quackable;

import java.util.Observer;

public class MallarDuck implements Quackable {
    Observable observable;

    public MallarDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }


    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }


    public void notifyObservers() {
        observable.notifyObservers();
    }
}
