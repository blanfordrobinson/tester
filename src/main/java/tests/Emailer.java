package tests;

import com.google.common.collect.Lists;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class Emailer {


	public static void main(String[] args){

		sendEmailHTML("hello", "<html>hello</html>");


	}

    private static void sendEmailHTML(String subject, String body ) {

        Properties p = new Properties();
        InputStream is = null;

        try {
            is = new FileInputStream("C:\\workspace\\tester\\src\\main\\resources\\tester.properties");
            p.load(is);
        }catch(IOException e){
            e.printStackTrace();
        }

        String r = p.getProperty("mail.recipient");



		HtmlEmail email = new HtmlEmail();
		email.setCharset( "UTF-8" );
		email.setHostName( "mapiarray.ici.org" );


        List<String> recips = Lists.newArrayList(r.split(","));
        //List<String> recips = Lists.newArrayList("blanford.robinson@ici.org","ccarelli@ici.org","dangoloborodko@ici.org");

		try {
			email.setFrom( "nmfp@ici.org", "nmfp@ici.org" );
			for ( String to : recips ) {
				System.out.println("===========>" + to);
				email.addTo( to, to );
			}

			email.setSubject( subject );
			email.setHtmlMsg( body );
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

    private static void sendEmailHTML(List<String> recips, String subject, String body ) {
		HtmlEmail email = new HtmlEmail();
		email.setCharset( "UTF-8" );
		email.setHostName( "mapiarray.ici.org" );
		try {
			email.setFrom( "nmfp@ici.org", "nmfp@ici.org" );
			for ( String to : recips ) {
				email.addTo( to, to );
			}
			email.setSubject( subject );
			email.setHtmlMsg( body );
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
