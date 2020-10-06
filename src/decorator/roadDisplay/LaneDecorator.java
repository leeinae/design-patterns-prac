package decorator.roadDisplay;

public class LaneDecorator extends DisplayDecorator{
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawLine();
    }

    private void drawLine() {
        System.out.println("\t 차선 표시");
    }
}
