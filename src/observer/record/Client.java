package observer.record;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        MaxMinView maxMinView = new MaxMinView(scoreRecord);
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);

        scoreRecord.setMaxMinView(maxMinView);
        scoreRecord.setDataSheetView(dataSheetView3);
        scoreRecord.setDataSheetView(dataSheetView5);

        for (int i = 1; i <= 5; i++) {
            int score = i * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}