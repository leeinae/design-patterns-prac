package strategy.Duck;

public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly..");
    }
}
