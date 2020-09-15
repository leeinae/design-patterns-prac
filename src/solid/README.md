## SOLID 원칙

- SRP: Single Responsibility Principle (단일 책임 원칙)
- OCP: Open Closed Prin (개방 폐쇄 원칙)
- LSP: 리스코프 치환 원칙
- ISP: Interface Segregation Principle (인터페이스 분리 원칙)
- DIP: Dependency Inversion Priciple (의존 역전 원칙)

다섯 원칙을 지키다보면 서로 상충되는 경우가 발생될 수 있음

1. SRP (single responsibility priciple)
    클래스의 역할을 **한 가지**로 구성하고, 한 가지 기능에만 충실할 수 있도록 한다.

    > 문제점: 클래스의 기능이 너무 많으면 유지보수가 어려워짐

1. OCP (open-closed priciple)
    기존 코드를 변경하지 않고 확장할 수 있도록 한다. **다형성, 추상화 활용**
    * 확장에 대해 열려있다.
        어플리케이션의 요구사항이 변경될 때 새로운 행위를 추가해 모듈을 확장
    * 수정에 대해 닫혀있다.
        모듈의 행위를 확장하는 것이 모듈의 소스코드나 바이너리 코드의 변경을 초래하지 않음
    
1. LSP (리스코프 치환 원칙)
    자식 클래스는 부모 클래스를 대체할 수 있어야한다.

    `사각형 > 정사각형`
    
1. ISP (interface segregation priciple)
    클라이언트가 자신이 이용하지 않는 메소드에 의존하지 않아야한다. => 인터페이스를 가능한 쪼개 분리시킬 수 있도록 한다.

1. DIP (dependency inversion priciple)
    가능하면 추상 클래스, 인터페이스를 상속받는 형태로 코드를 작성하라.
    기능을 직접 구현한 클래스는 코드 변경을 초래할 가능성이 높다.

    > ex.
    >
    > 자동차 -> 스노우 타이어 : 계절이 바뀌면 타이어 교체를 해야함
    >
    > 자동차 -> 타이어 interface -> (스노우 타이어, 일반 타이어) : 구체적인 타이어가 변경 되어도 자동차는 영향을 받지 않는 형태로 의존 관계 역전