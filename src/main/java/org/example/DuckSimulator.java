package org.example;

import org.example.Entity.*;

import java.util.Observer;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractFactory duckFactory){
//        Quackable mallarDuck = duckFactory.createMallardDuck();
//        Quackable redheadDuck = duckFactory.createRedheadDuck();
//        Quackable duckCall = duckFactory.createDuckCall();
//        Quackable rubberDuck = duckFactory.createRubberDuck();
//        Quackable gooseDuck = new GooseAdapter(new Goose());
//        Quackable pigeon = new PigeonAdapter(new Pigeon());
//        System.out.println("\nDuck Simulator: With Composite - Flocks");
//
        Flock flockOfDucks = new Flock();
//        flockOfDucks.add(redheadDuck);
//        flockOfDucks.add(duckCall);
//        flockOfDucks.add(rubberDuck);
//        flockOfDucks.add(gooseDuck);
//
//        Flock flockOfMallards = new Flock();
//        Quackable mallardOne = duckFactory.createMallardDuck();
//        Quackable mallardTwo = duckFactory.createMallardDuck();
//        Quackable mallardThree = duckFactory.createMallardDuck();
//        Quackable mallardFour = duckFactory.createMallardDuck();
//
//        flockOfMallards.add(mallardOne);
//        flockOfMallards.add(mallardTwo);
//        flockOfMallards.add(mallardThree);
//        flockOfMallards.add(mallardFour);
//
//        flockOfDucks.add(flockOfMallards);
//
//        System.out.println("\nDuck simulator: Whole Flock Simulation");
//        simulate(flockOfDucks);
//
//        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//        simulate(flockOfMallards);
//
////        simulate(mallarDuck);
////        simulate(redheadDuck);
////        simulate(duckCall);
////        simulate(rubberDuck);
////        simulate(gooseDuck);
////        simulate(pigeon);
//
//        System.out.println("The ducks quacked " + QuackCounter.getQuack() + "times");

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver((Observer) quackologist);

        simulate(flockOfDucks);

    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
