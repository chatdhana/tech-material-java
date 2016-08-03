import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.*;
import java.io.*;
public class FirstSax{
public static void main(String args[]) throws IOException{
                      
SAX SAXHandler = new SAX();
SAXParserFactory spf = SAXParserFactory.newInstance();
XMLReader xmlReader = null;
try {
    SAXParser saxParser = spf.newSAXParser();
    xmlReader = saxParser.getXMLReader();
} catch (Exception ex) {
    System.out.println(ex);
}

xmlReader.setContentHandler(SAXHandler);
xmlReader.setErrorHandler(SAXHandler);

try {
    xmlReader.parse(args[0]);
} catch (SAXException ex) {
    System.out.println(ex);
}
}
}