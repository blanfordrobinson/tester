package tests;

import org.apache.commons.cli.*;
import util.UtilFunc;

import java.util.Arrays;

/**
 * Created by blanfordrobinson on 6/18/2016.
 */
public class General {

    public static void main(String[] args){

        CommandLineParser parser = new GnuParser();
        CommandLine commandLine = null;

        Options options = new Options();
        options.addOption( "month", true, "month to process in mm/yyyy format" );

        try {
            commandLine = parser.parse( options, args );
        } catch ( ParseException e ) {
            e.printStackTrace();
        }


        System.out.println("===========================> "  +args[0]);
        System.out.println("===========================> "  +args[1]);
        UtilFunc.printObject(args);
        System.out.println("============================================");
        UtilFunc.printObject(commandLine);

    }


}
