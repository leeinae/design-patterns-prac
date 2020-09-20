package strategy;

public class CompareFileName extends Sorter implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) {
        FileInfo f1 = (FileInfo) o1;
        FileInfo f2 = (FileInfo) o2;

        String str1 = f1.getName();
        String str2 = f2.getName();

        return str1.compareTo(str2);
    }
}
