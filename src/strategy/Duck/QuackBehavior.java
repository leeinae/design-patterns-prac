package strategy.Duck;

public interface QuackBehavior {
    // default method를 사용하지 않는 경우 MallardDuck, RedheadDuck에서
    // quack()을 계속 override 해야함
//    default void quack() {
//        System.out.println("quack");
//    }

    void quack();
}
