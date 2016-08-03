package mine.spring.sample1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainSpringBean {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("sample1.xml");
		BeanFactory fact = new XmlBeanFactory(res);
		// HelloWorld hello = (HelloWorld) fact.getBean("helloWorld");
		HelloWorld hello = (HelloWorld) fact.getBean("hW");
		System.out.println(hello.hello("Student"));
	}

}
