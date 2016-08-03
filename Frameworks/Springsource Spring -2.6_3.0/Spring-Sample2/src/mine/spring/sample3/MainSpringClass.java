package mine.spring.sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class MainSpringClass {

	public static void main(String[] args) {

		//
		Resource res = new ClassPathResource("sample3.xml");
		BeanFactory fact = new XmlBeanFactory(res);
		//
		//
		// ApplicationContext appContext = new ClassPathXmlApplicationContext(
		// "sample3.xml");
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(
				"sample3.xml");

		// To shut down the Spring IoC container gracefully in non-web
		// applications
		// add a shutdown hook for the above context..
		appContext.registerShutdownHook();
		//

		System.out.println("Constructor Injection:");
		ConstructorInjection consInj = (ConstructorInjection) fact
				.getBean("consInj2");
		consInj.display();
		System.out.println("Setter Injection:");
		// SetterInjection settInj = (SetterInjection) fact.getBean("settInj1");
		SetterInjection settInj = (SetterInjection) appContext
				.getBean("settInj2");
		settInj.display();
		System.out.println("P-NameSpace:");
		PNameSpace pNameSpace = (PNameSpace) fact.getBean("pNamespace");
		pNameSpace.display();
		// Life Cycle Callbacks

		// By Implementing InitializingBean and/or DisposableBean interfaces
		System.out.println("Life Cycle CallBacks1:");
		LifeCycleCallbacks1 lifeCycle1 = (LifeCycleCallbacks1) appContext
				.getBean("lifeCycle1");
		try {
			// lifeCycle1.destroy();
		} catch (Exception e) {
		}
		// By using the attributes: init-method and destroy-method
		System.out.println("Life Cycle CallBacks2:");
		LifeCycleCallbacks2 lifeCycle2 = (LifeCycleCallbacks2) fact
				.getBean("lifeCycle2");
		//

		// Bean definition inheritance
		System.out.println("Bean definition inheritance..");
		SetterInjection childBean1 = (SetterInjection) fact
				.getBean("childBean");
		childBean1.display();
		SetterInjection childBean2 = (SetterInjection) appContext
				.getBean("childBean");
		childBean2.display();
		//
	}

}
