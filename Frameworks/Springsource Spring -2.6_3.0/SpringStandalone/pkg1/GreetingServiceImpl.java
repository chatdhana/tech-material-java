/*
 * Created on Sep 15, 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package pkg1;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GreetingServiceImpl implements GreetingService {
	private String greeting;
    /*Note: the value printed is injected in 2 ways.(refer hello.xml)
     * 1) via setter method
     * 2) via constructor
     */
	public GreetingServiceImpl(){}
	
	public GreetingServiceImpl(String greeting){
		this.greeting = greeting;
	}
	/**
	 * @return Returns the greeting.
	 */
	public String getGreeting() {
		return greeting;
	}
	/**
	 * @param greeting The greeting to set.
	 */
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	/* (non-Javadoc)
	 * @see pkg1.GreetingService#sayGreeting()
	 */
	public void sayGreeting() {
		// TODO Auto-generated method stub
		System.out.println(greeting);
	}
}
