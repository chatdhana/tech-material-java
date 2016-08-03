package mine.spring.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainSpringBean {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("helloWorld.xml");
		BeanFactory fact = new XmlBeanFactory(res);
		HelloWorld hello = (HelloWorld) fact.getBean("helloWorld");
		System.out.println(hello.hello("Student"));
	}

}
