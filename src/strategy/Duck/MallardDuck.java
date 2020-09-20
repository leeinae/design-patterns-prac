package strategy.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWing());
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck 입니다.");
    }
}
