package sorts;

import pojos.People;

import java.util.Comparator;

public class SortPeople implements Comparator {

    public int compare(Object f, Object s) {
        People o1 = (People) f;
        People o2 = (People) s;

        int c;
        c = (o1.getId()>o2.getId() ? 1 : (o1.getId()==o2.getId() ? 0 : -1));

        return c;
    }
}
