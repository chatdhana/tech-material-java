/* Note: 
 * This SpringappController  forwards to hello.jsp view.
 * This controller springappController.java  forwards a ModelAndView to the ViewResolver.
*/
//controller class
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SpringappController implements Controller {
/** Logger for this class and subclasses */
protected final Log logger = LogFactory.getLog(getClass());

public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	String now = (new java.util.Date()).toString(); //this string containing the current date &time is the model
	logger.info("SpringappController - returning hello view");
	return new ModelAndView("hello.jsp", "now", now);  
     
}
}
