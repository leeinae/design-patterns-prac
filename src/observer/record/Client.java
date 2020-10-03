package observer.record;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
        MaxMinView maxMinView = new MaxMinView(scoreRecord);

//        scoreRecord.setDataSheetView(dataSheetView);
        scoreRecord.setMaxMinView(maxMinView);

        for (int i = 1; i <= 5; i++) {
            int score = i * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}