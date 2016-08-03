package mine.spring.sample2;

public class OuterClass {
	String name;
	String id;

	// Instance Factory method
	OuterClass getInstance() {
		OuterClass outer = new OuterClass();
		outer.id = "0000";
		outer.name = "default";
		return outer;
	}

	// Static Factory method
	static OuterClass createInstance() {
		OuterClass outer = new OuterClass();
		outer.id = "0000";
		outer.name = "default";
		return outer;
	}

	String displayDetails() {

		return "Hi " + this.name + ",.. Your employee Id is:" + this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	static class StaticInnerClass {
		String address1;
		String address2;

		public StaticInnerClass() {

		}

		String displayAddress() {
			return "From Static Inner Class:" + address1 + "," + address2;
		}

		public String getAddress1() {
			return address1;
		}

		public void setAddress1(String address1) {
			this.address1 = address1;
		}

		public String getAddress2() {
			return address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
		}
	}

	static class InstanceInnerClass {
		String address1;
		String address2;

		public InstanceInnerClass() {

		}

		String displayAddress() {
			return "From Instance Inner Class:" + address1 + "," + address2;
		}

		public String getAddress1() {
			return address1;
		}

		public void setAddress1(String address1) {
			this.address1 = address1;
		}

		public String getAddress2() {
			return address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
		}
	}
}
