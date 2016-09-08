package util;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * Created by blanfordrobinson on 12/15/2015.
 */
public class UtilFunc {

    public static void printObject(Object val){
        XStream xs = new XStream(new StaxDriver());
        System.out.println(xs.toXML(val));
    }
}
