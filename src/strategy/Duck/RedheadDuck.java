package strategy.Duck;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWing());
    }

    @Override
    public void display() {
        System.out.println("RedHead Duck 입니다.");
    }
}
