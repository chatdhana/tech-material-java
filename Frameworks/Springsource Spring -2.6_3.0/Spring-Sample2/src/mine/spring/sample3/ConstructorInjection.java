package mine.spring.sample3;

public class ConstructorInjection {

	private CollaboratingClass depObj;

	String empAccNo;
	String empNature;

	public ConstructorInjection(CollaboratingClass depObj) {
		this.depObj = depObj;
	}

	public ConstructorInjection(CollaboratingClass depObj, String empAccNo,
			String empNature) {
		this.depObj = depObj;
		this.empAccNo = empAccNo;
		this.empNature = empNature;
	}

	void display() {
		System.out.println("Emp ID:" + depObj.empId + " Emp Name:"
				+ depObj.empName);
		System.out.println("Emp Acc No:" + empAccNo + " Emp Nature:"
				+ empNature);
	}
}
