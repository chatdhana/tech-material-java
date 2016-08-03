package mine.spring.sample3;

public class PNameSpace {
int id;
String name;
CollaboratingClass collObj;

void display() {
	System.out.println("Emp ID:" + collObj.empId + " Emp Name:"
			+ collObj.empName);
	System.out.println("Emp id:" + id + " Emp name:"
			+ name);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public CollaboratingClass getCollObj() {
	return collObj;
}
public void setCollObj(CollaboratingClass collObj) {
	this.collObj = collObj;
}
}
