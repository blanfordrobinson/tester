package tests;

import com.google.common.base.Throwables;
import org.ici.nmfp2.EdgarSubmission;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 * Created by blanfordrobinson on 9/2/2016.
 */
public class Parse {



    private static JAXBContext getContext() {

       JAXBContext _context = null;

        try {
            _context = JAXBContext.newInstance("org.ici.nmfp2:org.ici.nmfp2.common:org.ici.nmfp2.edgar_common");
        } catch (JAXBException e) {
            Throwables.propagate( e );
        }

        return _context;

    }

    public static void main(String[] args) {

        File f = new File("C:\\workspace\\nmfp\\src\\test\\resources\\nmfp2\\receive\\N_0000857156_S000004502_07_2016I.xml");

        System.out.println(f);

        FileReader fileReader = null;
        try {
            fileReader = new FileReader( f );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        JAXBContext context = getContext();

        Unmarshaller unmarshaller = null;
        try {
            unmarshaller = context.createUnmarshaller();
        } catch ( JAXBException e ) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader( fileReader );

        while( true ) {
            try {
                reader.mark(1);
                char[] potentialStart = new char[1];
                int result = reader.read( potentialStart );
                if ( result != 1 ) {
                    System.out.printf("end of file reached looking for start of XML" );

                }
                if('<' == potentialStart[0]) {
                    reader.reset();
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // now use our unmarshaller to read the file in
        EdgarSubmission submission = null;
        try {
            submission = (EdgarSubmission)unmarshaller.unmarshal( reader );

            System.out.println(submission.getHeaderData().getSubmissionType().value());
            System.out.println(submission.getHeaderData().getFilerInfo().getFiler().getFilerCredentials().getCik());

        } catch ( JAXBException e ) {
            e.printStackTrace();
        }
        if ( submission != null ) {
            System.out.println(submission );
        }


    }


}
