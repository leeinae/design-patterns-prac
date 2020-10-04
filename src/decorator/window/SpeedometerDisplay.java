package decorator.window;

import javax.swing.*;

public class SpeedometerDisplay extends DisplayDecorator {
    private Display displayComponent;
    private int width, height;
    private LabelPanel labelPanel;

    SpeedometerDisplay(Display displayComponent, int width, int height) {
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
        // 자체 패널 생성 -> 기존 컴포넌트 생성 -> 패널에 붙이고
        // label 생성해서 추가
        JPanel jp = displayComponent.create();

        labelPanel = new LabelPanel();
        jp.add(labelPanel.createPanel(this.width, this.height));
        return jp;
    }

    @Override
    public void show() {
        labelPanel.updateText("[Speed] speed: 50");
        displayComponent.show();
        System.out.println("[Speed] speed: 50");
    }
}
