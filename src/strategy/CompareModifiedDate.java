package strategy;

import java.util.Date;

public class CompareModifiedDate extends Sorter implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) {
        Date d1 = ((FileInfo) o1).getModifiedDate();
        Date d2 = ((FileInfo) o2).getModifiedDate();

        return d1.compareTo(d2);
    }
}
