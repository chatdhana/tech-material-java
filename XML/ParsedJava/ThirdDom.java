import javax.xml.parsers.*;
import org.w3c.dom.*;
public class ThirdDom {
    public static void main(String args[]) {
        try {
              
               	DocumentBuilderFactory factory =
    DocumentBuilderFactory.newInstance();
 	DocumentBuilder builder = factory.newDocumentBuilder();
 	            Document document = builder.parse("company.xml");
           Element root = document.getDocumentElement();
 Node textNode = root.getFirstChild();
 System.out.println(textNode.getNodeValue());

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
