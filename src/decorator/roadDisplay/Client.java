package decorator.roadDisplay;

public class Client {
    public static void main(String[] args) {
        Display roadDisplay = new RoadDisplay();
        roadDisplay.draw();

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw(); // 기본 + 차선

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw(); // 기본 + 교통

        Display roadDisplay2 = new LaneDecorator(roadDisplay);
        roadDisplay2.draw(); // 기본 + 교통

        Display roadDisplay3 = new TrafficDecorator(roadDisplay2);
        roadDisplay3.draw(); // 기본 + 교통 + 차선

        Display crossingDisplay = new CrossingDecorator(new TrafficDecorator(new RoadDisplay()));
        crossingDisplay.draw(); // 기본 + 교통 + 교차로
    }
}
