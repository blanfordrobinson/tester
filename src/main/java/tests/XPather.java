package tests;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.FileInputStream;
import java.io.IOException;

public class XPather {

    //...
    public static void main(String[] args) {


        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            FileInputStream fis = new FileInputStream("C:\\Users\\blanfordrobinson\\Desktop\\N_0000857156_S000004502_07_2016I.xml");
            //FileInputStream fis = new FileInputStream("N_0000857156_S000004502_07_2016I.xml");
            InputSource is = new InputSource(fis);
            Document document = builder.parse(is);

            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile("/edgarSubmission/headerData/submissionType");

            String out = (String)expr.evaluate(document, XPathConstants.STRING);

            System.out.println(out);

        } catch (ParserConfigurationException e){
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
