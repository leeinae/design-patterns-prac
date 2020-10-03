### detail
+ ScoreRecord: 입력된 점수를 저장하는 클래스
+ DataSheetView: ScoreRecord 클래스와 점수를 출력하는 클래스

## version 1 문제점
+ 성적을 기존 형태가 아닌 다른 형태로 출력해야하는 경우
- 여러 가지 형태의 성적을 동시, 순차적으로 출력하려면?
=> 새로운 MaxMinView 클래스를 추가해야함 

## version 2
###코드 수정된 부분
+ MaxMinView 추가
+ 기존 DataSheetView 제거
+ 여러 개의 DataSheetView 저장을 위한 리스트 추가
+ 기존 Client 코드 변경
-> 비효율..