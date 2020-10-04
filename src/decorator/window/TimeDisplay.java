package decorator.window;

import javax.swing.*;
import java.time.LocalDateTime;

public class TimeDisplay extends DisplayDecorator {
    private Display displayComponent;
    private int width, height;
    private LabelPanel labelPanel;

    public TimeDisplay(Display displayComponent, int width, int height) {
        super(displayComponent, width, height);
        this.displayComponent = displayComponent;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getHeight() {
        return displayComponent.getHeight() + this.height;
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
        labelPanel.updateText("[Time] time: " + LocalDateTime.now().toString());
        displayComponent.show();
        System.out.println(LocalDateTime.now());
    }
}
