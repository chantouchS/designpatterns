package lab8.composite_pattern;


import lab8.abstract_factory_pattern.AbstractDuckFactory;
import lab8.abstract_factory_pattern.CountingDuckFactory;
import lab8.adapter_pattern.Quackable;
import lab8.decorator_pattern.QuackCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
//        Quackable gooseDuck = new GooseAdaptor(new Goose());
//        Quackable pigeonDuck = new PigeonAdaptor(new Pigeon());
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);



        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);


        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
