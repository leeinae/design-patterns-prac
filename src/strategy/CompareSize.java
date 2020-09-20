package strategy;

public class CompareSize extends Sorter implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) {
        int s1 = ((FileInfo) o1).getSize();
        int s2 = ((FileInfo) o2).getSize();

        return s1 - s2;
    }
}
