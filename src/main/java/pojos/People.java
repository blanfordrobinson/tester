package pojos;

import java.util.Comparator;

/**
 * Created by blanfordrobinson on 12/15/2015.
 */
public class People {


    public People(int startId, String startLastname, String startFirstname) {
        this.setId(startId);
        this.setLastname(startLastname);
        this.setFirstname(startFirstname);
    }

    int id;
    String lastname;
    String firstname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public static Comparator<People> PeopleName = new Comparator<People>() {

        public int compare(People s1, People s2) {

            String peopleName1 = s1.getLastname().toUpperCase();
            String peopleName2 = s2.getLastname().toUpperCase();

            return peopleName1.compareTo(peopleName2);


        }
    };
}
