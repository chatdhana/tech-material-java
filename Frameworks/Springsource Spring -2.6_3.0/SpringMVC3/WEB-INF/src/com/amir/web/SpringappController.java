package com.amir.web;

/* Note: 
 * This SpringappController  forwards to hello.jsp view.
 * This controller springappController.java  forwards a ModelAndView to the ViewResolver.
*/
//controller class
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.amir.business.ProductManager;

public class SpringappController implements Controller 
{
/** Logger for this class and subclasses */
protected final Log logger = LogFactory.getLog(getClass());

private ProductManager prodMan;

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String now = (new java.util.Date()).toString();     //this string containing the current date &time is the model
		logger.info("SpringappController - returning hello view");
		
		Map myModel = new HashMap();
	    myModel.put("now", now);
	    myModel.put("products", getProductManager().getProducts());
	    
	    
		return new ModelAndView("hello", "model", myModel);  //  suffix & prefix added to,hello, via springapp-servlet.xml as ViewResolver     
	}
	
	public void setProductManager(ProductManager pm) 
	{
        prodMan = pm;
    }

    public ProductManager getProductManager() 
    {
        return prodMan;
    }
	
}
