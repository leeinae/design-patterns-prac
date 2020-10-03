package observer.record;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<>();

    private List<DataSheetView> dataSheetViews = new ArrayList<>();
    private MaxMinView maxMinView;

    public void setMaxMinView(MaxMinView maxMinView) {
        this.maxMinView = maxMinView;
    }

    public void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetViews.add(dataSheetView);
    }

    public void addScore(int score) {
        scores.add(score);

        for (DataSheetView dataSheetView: dataSheetViews) {
            dataSheetView.update();
        }
        maxMinView.update();
    }

    public List<Integer> getScoreRecore() {
        return scores;
    }
}
