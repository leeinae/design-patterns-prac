package strategy.Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        duck1.setQuackBehavior(new Quack());
        duck1.setFlyBehavior(new FlyWithWing());

        Duck duck2 = new MallardDuck();
        Duck duck3 = new RedheadDuck();
        Duck duck4 = new RubberDuck();

        System.out.println("-------------------");
        duck1.performQuack();
        duck2.performQuack();
        duck3.performQuack();
        duck4.performQuack();

        System.out.println("-------------------");
        duck1.performFly();
        duck4.performFly();

        System.out.println("-------------------");
        duck1.display();
        duck2.display();
        duck3.display();
        duck4.display();
    }
}
