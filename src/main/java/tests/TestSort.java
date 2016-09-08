package tests;

import pojos.People;
import sorts.SortPeople;
import util.UtilFunc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by blanfordrobinson on 12/15/2015.
 */
public class TestSort {

    public static void main (String[] args) {


        List<People> listPeople = new ArrayList<People>();

        listPeople.add(new People(3, "Robinson", "Blanford"));
        listPeople.add(new People(1, "Golob", "Dan"));
        listPeople.add(new People(2, "Banfi", "Vince"));


        //Collections.sort(listPeople, new SortPeople());

        Collections.sort(listPeople, People.PeopleName);

        UtilFunc.printObject(listPeople);
    }

}
