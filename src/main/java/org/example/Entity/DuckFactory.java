package org.example.Entity;

import org.example.AbstractFactory;
import org.example.Quackable;

public class DuckFactory extends AbstractFactory {

    public Quackable createMallardDuck() {
        return new MallarDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
