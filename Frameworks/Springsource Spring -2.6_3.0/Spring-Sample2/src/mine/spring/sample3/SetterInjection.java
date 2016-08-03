package mine.spring.sample3;

public class SetterInjection {
	private CollaboratingClass depObj;

	String empAccNo;
	String empNature;
	
	void display() {
		System.out.println("Emp ID:" + depObj.empId + " Emp Name:"
				+ depObj.empName);
		System.out.println("Emp Acc No:" + empAccNo + " Emp Nature:"
				+ empNature);
	}
	
	public CollaboratingClass getDepObj() {
		return depObj;
	}
	public void setDepObj(CollaboratingClass depObj) {
		this.depObj = depObj;
	}
	public String getEmpAccNo() {
		return empAccNo;
	}
	public void setEmpAccNo(String empAccNo) {
		this.empAccNo = empAccNo;
	}
	public String getEmpNature() {
		return empNature;
	}
	public void setEmpNature(String empNature) {
		this.empNature = empNature;
	}
}
