package decorator.roadDisplay;

public class RoadDisplayWithLane extends RoadDisplay{
    @Override
    public void draw() {
        super.draw();
        drawLine();
    }

    private void drawLine() {
        System.out.println("차선 표시");
    }
}
