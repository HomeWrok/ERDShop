
package offices;

public class premium extends AbstractOffice {
	String houers; 
	String poolsize;
	
	public premium(String name, String type, String Address, String houers, String poolsize) {
		super(name, type, Address);
		this.houers = houers;
		this.poolsize = poolsize;
		
	}

	public String getHouers() {
		return houers;
	}

	public void setHouers(String houers) {
		this.houers = houers;
	}

	public String getPoolsize() {
		return poolsize;
	}

	public void setPoolsize(String poolsize) {
		this.poolsize = poolsize;
	}

	 
	
}
