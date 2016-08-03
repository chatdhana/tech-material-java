import java.io.*;
import java.util.*;
import saxbean.*;

public class MyTestDriver {

   public static void main(String argv[]) {
      String file = new String(argv[0]);
      MySAXParserBean p = new MySAXParserBean();
      String str = null;
      try {
         Collection v = p.parse(file);
         Iterator it = v.iterator();
         while(it.hasNext()) {
            MyElement element = (MyElement)it.next();
            String tag = element.getLocalName();

            if(tag.equals("symbol")) 
            {
              System.out.println("Symbol:" + element.getValue());
            } else if(tag.equals("name")) {
              System.out.println("Name: "
              +element.getValue());
            } else if (tag.equals("price")) {
              System.out.println("Price: "
              +element.getValue());
            }
         }
      } catch (Exception e) {
      }
   }
}
