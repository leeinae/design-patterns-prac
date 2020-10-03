package observer.record;

import java.util.List;

public class DataSheetView {
    private ScoreRecord scoreRecord;
    private int viewCount; //명시된 개수만큼만 점수 출력

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.viewCount = viewCount;
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecore();
        displayScores(record, viewCount);
    }

    public void displayScores(List<Integer> record, int viewCount) {
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.print(record.get(i) + ", ");
        }
        System.out.println();
    }
}
