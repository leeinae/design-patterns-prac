package observer.record;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        Observer maxMinView = new MaxMinView(scoreRecord);
        Observer dataSheetView3 = new DataSheetView(scoreRecord, 3);
        Observer dataSheetView5 = new DataSheetView(scoreRecord, 5);

        scoreRecord.attach(maxMinView);
        scoreRecord.attach(dataSheetView3);
        scoreRecord.attach(dataSheetView5);

        for (int i = 1; i <= 5; i++) {
            int score = i * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}