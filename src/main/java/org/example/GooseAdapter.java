package org.example;

import org.example.Entity.Goose;

import java.util.Observer;

public class GooseAdapter implements Quackable{
    Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }
    public void quack(){
        this.goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
