/*
 * Created on Sep 15, 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package pkg1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Demo {
	public static void main(String args[])
	{
		//BeanFactory factory=(BeanFactory) new XmlBeanFactory(new FileInputStream("hello.xml"));
		BeanFactory factory= new XmlBeanFactory(new FileSystemResource("hello.xml"));
		GreetingService greetingService=(GreetingService)factory.getBean("greetingService"); // id in hello.xml
		greetingService.sayGreeting();	
	}
}
