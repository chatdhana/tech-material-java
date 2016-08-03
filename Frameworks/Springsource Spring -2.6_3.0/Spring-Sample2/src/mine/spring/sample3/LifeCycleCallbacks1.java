package mine.spring.sample3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleCallbacks1 implements InitializingBean, DisposableBean {

	private String field1;
	private String field2;
	private String field3;
	
	// Overriding method in InitializingBean
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet() method.");
		if (field1 == null || field2 == null || field3 == null) {
			System.out.println("All the properties are not set properly.");
		}else{
			System.out.println("All the properties are set properly.");
		}
	}

	// Overriding method in DisposableBean
	public void destroy() throws Exception {
		// You can explicitly close connection, or destroy any object,..
		System.out.println("Destroyed dependency objects successfully..");
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

}
