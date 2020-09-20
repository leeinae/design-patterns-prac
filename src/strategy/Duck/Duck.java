package strategy.Duck;

public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("수영합니다.");
    }

    public void display() {
        System.out.println("기본 오리입니다.");
    }

//    public void quack() {
//        System.out.println("꽥");
//    }

//    public void fiy() {
//        System.out.println("fly...");
//    }

    // 클래스마다 다르게 동작하는 부분을 제거 -> 일반화
    public void performQuack() {
        if (quackBehavior != null) {
           quackBehavior.quack();
        }
    }

    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
