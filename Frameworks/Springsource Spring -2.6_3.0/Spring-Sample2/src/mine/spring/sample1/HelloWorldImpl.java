package mine.spring.sample1;

public class HelloWorldImpl implements HelloWorld {

	private String hello;

	public String hello(String msg) {
		return "Hello " + msg + "! " + this.hello;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}
