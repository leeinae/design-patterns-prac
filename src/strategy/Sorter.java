package strategy;

public class Sorter {
    private Comparable comparable;

    public Sorter() {
    }

    public Sorter(Comparable comparable) {
        setComparable(comparable);
    }

    public void setComparable(Comparable comparable) {
        this.comparable = comparable;
    }

    public void bubbleSort(Object[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (comparable.compareTo(data[j], data[j + 1]) > 0) { // swap
                    Object temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
