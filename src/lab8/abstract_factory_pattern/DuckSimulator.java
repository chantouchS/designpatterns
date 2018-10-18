package lab8.abstract_factory_pattern;

import lab8.adapter_pattern.Goose;
import lab8.adapter_pattern.GooseAdaptor;
import lab8.adapter_pattern.Quackable;
import lab8.decorator_pattern.QuackCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);
        System.out.println("-------------------------------------------");

        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        simulator.simulate(countingDuckFactory);
        System.out.println("-------------------------------------------");

        AbstractDuckFactory echoDuckFactory = new EchoDuckFactory();
        simulator.simulate(echoDuckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdaptor(new Goose());

        System.out.println("\nDuck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("The ducks quacked" + QuackCounter.getQuacks() + " times");

        }
    void simulate(Quackable duck){
        duck.quack();
    }

}
