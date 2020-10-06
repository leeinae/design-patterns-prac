# decorator pattern
데코레이터 패턴

## Road Display prac
#### version 1
+ RoadDisplay: 기본 도로 정보 출력
- RoadDisplayWithLine `extends RoadDisplay`: 기본 도로 정보 + 차선 표시

문제점
1. 추가 도로 정보를 표시하려면?
1. 여러 가지 추가 기능을 조합해 제공하려면?

=> 데코레이터 패턴 사용
RoadDisplay 객체로 기본 기능 제공
LaneDecorator, TrafficDecorator로 추가 기능을 넣을 수 있다.
모든 객체가 **Display** 클래스를 통해 이뤄짐. 