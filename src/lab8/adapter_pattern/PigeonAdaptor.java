package lab8.adapter_pattern;

public class PigeonAdaptor implements Quackable {
    Pigeon pigeon;

    public PigeonAdaptor(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
