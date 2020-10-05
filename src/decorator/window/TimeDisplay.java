package decorator.window;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class TimeDisplay extends DisplayDecorator {
    private Display displayComponent;
    private LabelPanel labelPanel;

    public TimeDisplay(Display displayComponent, int width, int height) {
        super(displayComponent, width, height);
        this.displayComponent = displayComponent;
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
        labelPanel.updateText("[Time] time: " + LocalDateTime.now().toString());
        displayComponent.show();
        System.out.println(LocalDateTime.now());
    }
}
