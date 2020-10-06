package decorator.roadDisplay;

public class Client {
    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw();

        RoadDisplayWithLane roadWithLine = new RoadDisplayWithLane();
        roadWithLine.draw(); // 기본 도로 + 차선 표기

        RoadDisplayWithTraffic roadWithTraffic = new RoadDisplayWithTraffic();
        roadWithTraffic.draw(); // 기본 도로 + 교통량
    }
}
