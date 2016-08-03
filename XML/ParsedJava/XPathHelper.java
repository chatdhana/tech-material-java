import org.w3c.dom.*;
import org.xml.sax.*;

import org.apache.xalan.xpath.*;
import org.apache.xalan.xpath.xml.*;

public class XPathHelper {

   XMLParserLiaison xpathSupport = null;
   XPathProcessor xpathParser = null;
   PrefixResolver prefixResolver = null;

   XPathHelper() {
      xpathSupport = new XMLParserLiaisonDefault();
      xpathParser = new XPathProcessorImpl(xpathSupport);
   }

   public NodeList processXPath(String xpath, Node target) throws SAXException {
      prefixResolver = new PrefixResolverDefault(target);

      // create the XPath and initialize it
      XPath xp = new XPath();
      xpathParser.initXPath(xp, xpath, prefixResolver);

      // now execute the XPath select statement
      XObject list = xp.execute(xpathSupport, target, prefixResolver);

      // return the resulting node
      return list.nodeset();
   }
}

