package strategy.Duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("RubberDuck 입니다.");
    }

    // 새로운 기능인 fly가 추가된 경우 RubberDuck은 날지 못하는데 fly()함수를 쓸 수 있음.
    // 해결 방법 -> Quack, Fly (공통적인 기능)으로 인터페이스를 분리한다.
//    @Override
//    public void fiy() {
//        System.out.println("cannot fly");
//    }
}
