package decorator.window;

import javax.swing.*;

public class WeatherDisplay extends DisplayDecorator {
    private Display displayComponent;
    private int width, height;
    private LabelPanel labelPanel;

    public WeatherDisplay(Display displayComponent, int width, int height) {
        super(displayComponent, width, height);
        this.displayComponent = displayComponent;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getHeight() {
        return super.getHeight() + this.height;
    }

    @Override
    public JPanel create() {
        JPanel jp = displayComponent.create();

        labelPanel = new LabelPanel();
        jp.add(labelPanel.createPanel(this.width, this.height));
        return jp;
    }

    @Override
    public void show() {
        labelPanel.updateText("[Weather] 온도: 20도, 습도: 60");
        displayComponent.show();
        System.out.println("[Weather] 온도: 20도, 습도: 60");
    }
}
