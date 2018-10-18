package lab8.decorator_pattern;


import lab8.adapter_pattern.Quackable;

public class QuackEcho implements Quackable {
    Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.print("ECHO: ");
        duck.quack();
    }
}
