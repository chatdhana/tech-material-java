import org.w3c.dom.*;
import org.apache.xerces.parsers.DOMParser;

public class DOM
{
    public static void main(String[] args) 
    {

        try {
            DOMParser parser = new DOMParser();
            parser.parse(args[0]);
            Document doc = parser.getDocument();

            NodeList nodes = doc.getElementsByTagName("servlet");
            System.out.println("There are " + nodes.getLength() +                "  elements.");

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
