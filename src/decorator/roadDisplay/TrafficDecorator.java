package decorator.roadDisplay;

public class TrafficDecorator extends DisplayDecorator{
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("\t 교통량 표시");
    }
}
