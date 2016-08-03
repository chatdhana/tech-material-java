package mine.spring.sample2;

import mine.spring.sample2.OuterClass.InstanceInnerClass;
import mine.spring.sample2.OuterClass.StaticInnerClass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class MainSpringBean {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("sample2.xml");
		BeanFactory fact = new XmlBeanFactory(res);
		//Outer Class
		OuterClass outer = (OuterClass) fact.getBean("outerClass");
		System.out.println(outer.displayDetails());
		//Static Inner Class
		StaticInnerClass innerStatic=(StaticInnerClass) fact.getBean("staticInnerClass");
		System.out.println(innerStatic.displayAddress());
		// Instance Inner Class		
		InstanceInnerClass innerInstance=(InstanceInnerClass) fact.getBean("instanceInnerClass");
		System.out.println(innerInstance.displayAddress());
		//Initialization using Static Factory Method
		OuterClass outer1 = (OuterClass) fact.getBean("outerClassStaFact");
		System.out.println(outer1.displayDetails());
		//Initialization using Instance Factory Method
		OuterClass outer2 = (OuterClass) fact.getBean("outerClassInsFact");
		System.out.println(outer2.displayDetails());
		
	}

}


