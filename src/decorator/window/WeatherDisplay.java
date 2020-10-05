package decorator.window;

import javax.swing.*;
import java.awt.*;

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
        return displayComponent.getHeight() + super.getHeight();
    }

    @Override
    public JPanel create() {
        JPanel jPanel = new JPanel();
        labelPanel = new LabelPanel();

        jPanel.setLayout(new BoxLayout(jPanel, 1));
        jPanel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        jPanel.setPreferredSize(new Dimension(getWidth(), getHeight()));

        jPanel.add(displayComponent.create());
        jPanel.add(labelPanel.createPanel(getWidth(), getHeight()));
        return jPanel;
    }

    @Override
    public void show() {
        displayComponent.show();
        labelPanel.updateText("[Weather] 온도: 20도, 습도: 60");
        System.out.println("[Weather] 온도: 20도, 습도: 60");
    }
}
