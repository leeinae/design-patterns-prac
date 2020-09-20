package strategy.Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new MallardDuck();
        Duck duck3 = new RedheadDuck();

        duck1.quack();
        duck2.quack();
        duck3.quack();

        duck1.display();
        duck2.display();
        duck3.display();
    }
}
