package mine.spring.sample3;

public class LifeCycleCallbacks2 {
	private String field1;
	private String field2;
	private String field3;

	// This method will be mentioned in the init-method attribute of the bean
	// definition.
	public void init() {
		System.out.println("Inside init() method.");
		if (field1 == null || field2 == null || field3 == null) {
			System.out.println("All the properties are not set properly.");
		} else {
			System.out.println("All the properties are set properly.");
		}
	}

	// This method will be mentioned in the destroy-method attribute of the bean
	// definition.
	public void clean() {
		// You can explicitly close connection, or destroy any object,..
		System.out.println("Destroyed dependency objects successfully.");

	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}
}
