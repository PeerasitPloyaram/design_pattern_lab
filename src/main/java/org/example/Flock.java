package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

public class Flock implements Quackable{
    Observable observable;
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    public void quack(){
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }


    public void notifyObservers() {
        observable.notifyObservers();
    }
}
