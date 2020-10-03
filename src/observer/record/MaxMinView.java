package observer.record;

import java.util.Collections;
import java.util.List;

public class MaxMinView {
    private ScoreRecord scoreRecord;

    public MaxMinView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecore();
        displayMaxMin(record);
    }

    public void displayMaxMin(List<Integer> record) {
        int min = Collections.min(record);
        int max = Collections.max(record);

        System.out.println("Max : " + max + ", Min: " + min);
    }
}
