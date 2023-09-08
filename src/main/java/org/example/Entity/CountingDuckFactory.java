package org.example.Entity;

import org.example.AbstractFactory;
import org.example.QuackCounter;
import org.example.QuackEcho;
import org.example.Quackable;

public class CountingDuckFactory extends AbstractFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackEcho(new QuackCounter(new MallarDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackEcho(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}
