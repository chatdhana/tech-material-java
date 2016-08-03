import javax.xml.parsers.*; // for both SAX and DOM
import org.xml.sax.*;
import org.xml.sax.helpers.*;

 	// For simplicity, we let the operating system handle exceptions
// In "real life" this is poor programming practice
public class Sample {
    public static void main(String args[]) throws Exception {
 	       // Create a parser factory
       SAXParserFactory factory = SAXParserFactory.newInstance();
 	       // Tell factory that the parser must understand namespaces
       factory.setNamespaceAware(true);
 	       // Make the parser
        SAXParser saxParser = factory.newSAXParser();
        XMLReader parser = saxParser.getXMLReader();
 	           // Create a handler
        Handler handler = new Handler();
 	        // Tell the parser to use this handler
        parser.setContentHandler(handler);
 	        // Finally, read and parse the document
        parser.parse("company.xml");
 	    } // end of Sample class

       public static class Handler extends DefaultHandler {

       // SAX calls this method when it encounters a start tag
    public void startElement(String namespaceURI,
                                          String localName,
                                          String qualifiedName,
                                          Attributes attributes)
             throws SAXException {
        System.out.println("startElement: " + qualifiedName);
    }

          // SAX calls this method to pass in character data
    public void characters(char ch[], int start, int length)
            throws SAXException {
        System.out.println("characters: " +
                                     new String(ch, start, length));
    }
    
    // SAX call this method when it encounters an end tag
    public void endElement(String namespaceURI,
                                        String localName,
                                        String qualifiedName)
            throws SAXException {
        System.out.println("Element: /" + qualifiedName);
    }

} // End of Handler class

}