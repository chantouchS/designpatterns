package lab8.decorator_pattern;


import lab8.adapter_pattern.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate(){
        Quackable malardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadQuack = new QuackCounter(new QuackEcho((new RedheadDuck())));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable goose = new GooseAdaptor(new Goose());
        Quackable pigeon = new PigeonAdaptor(new Pigeon());

        System.out.println("\nDuck Simulator");

        simulate(malardDuck);
        simulate(redheadQuack);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");

        }
    void simulate(Quackable duck){
        duck.quack();
    }

}
