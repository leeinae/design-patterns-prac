# 데코레이터 패턴
기본 기능에 추가할 수 있는 기능의 종류가 많은 경우 각 추가 기능을 **Decorator class**로 정의한 후 필요한 객체를 조합하며 추가 기능의 조합을 설계하는 방식.

**상속을 사용하지 않고도 유연한 기능의 확장을 가능하도록 만듬**

ex) 카페 음료 커스텀, 전광판 

## 문제 상황
조금씩 다양한 종류가 생길 때, 기능이 늘어날수록 확장이 어렵다.
해결: 상속이 아닌 **연관**으로 기능을 추가한다. 

## Component - Decorator
Component: ConcreteComponent & Decorator의 공통 기능을 구현하는 클래스. Component를 통해 실제 객체를 사용

ConcreteComponent: 기본 기능을 구현하는 클래스.

Decorator: 많은 수가 존재하는 구체적인 Decorator의 공통 기능을 구현

ConcreteDecoratorA, B .. : Decorator의 하위 클래스로, 각각 추가 기능을 구현. 

## 데코레이터 패턴을 사용하지 않을 때의 문제점
- 너무 많은 상속 관계가 발생할 가능성이 있다.