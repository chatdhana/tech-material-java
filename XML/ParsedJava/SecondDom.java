import javax.xml.parsers.*;
import org.w3c.dom.*;
public class SecondDom {
    public static void main(String args[]) {
        try {
              //System.out.println("Hello World");

               	DocumentBuilderFactory factory =
    DocumentBuilderFactory.newInstance();
 	DocumentBuilder builder = factory.newDocumentBuilder();
 	            Document document = builder.parse("hello.xml");
           Element root = document.getDocumentElement();
 Node textNode = root.getFirstChild();
 System.out.println(textNode.getNodeValue());

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
