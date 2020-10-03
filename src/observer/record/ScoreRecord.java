package observer.record;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<>();
//    private DataSheetView dataSheetView;
    private MaxMinView maxMinView;

    public void setMaxMinView(MaxMinView maxMinView) {
        this.maxMinView = maxMinView;
    }

//    public void setDataSheetView(DataSheetView dataSheetView) {
//        this.dataSheetView = dataSheetView;
//    }

    public void addScore(int score) {
        scores.add(score);
//        dataSheetView.update();
        maxMinView.update();
    }

    public List<Integer> getScoreRecore() {
        return scores;
    }
}
