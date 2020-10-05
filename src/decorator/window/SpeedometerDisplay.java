package decorator.window;

import javax.swing.*;
import java.awt.*;

public class SpeedometerDisplay extends DisplayDecorator {
    private Display displayComponent;
    private LabelPanel labelPanel;

    SpeedometerDisplay(Display displayComponent, int width, int height) {
        super(displayComponent, width, height);
        this.displayComponent = displayComponent;
    }

    @Override
    public int getHeight() {
        return displayComponent.getHeight() + super.getHeight();
    }

    @Override
    public JPanel create() {
        // 자체 패널 생성 -> 기존 컴포넌트 생성 -> 패널에 붙이고
        // label 생성해서 추가
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
        labelPanel.updateText("[Speed] speed: 50");
        displayComponent.show();
        System.out.println("[Speed] speed: 50");
    }
}
