package PP03;


public class Employee extends Person {     // 1- The Employee class extends superclass Person.  //FIXME - what does it mean "uses" (Has A) class Address?
	
	private int eID;
    private Status empStatus;
    
        // 2- add the subclass Employee constructor that calls the supper Person class constructor, you should provide input data for all parent class data fields
    	//FIXME - 1) Do I need the default no-arg constructor? Instructions does not specify. 
    
    public Employee()	{
    	super();
    }
    
    public Employee(String fName, String lName, Address address, int eID, Status empStatus)	{
    	super(fName, lName, address); 
    	this.eID = eID;
    	this.empStatus = empStatus;
    	
    }
  
    //public empStatus() method that returns the value of the empStatus field. (this is from the handout)
    
    public Status empStatus()	{
    	
    	return empStatus;
    	
    }
    
    
    
   // 3- add setters/getters methods
    

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public Status getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(Status empStatus) {
		this.empStatus = empStatus;
	}
    
    
    
   // 4- add override toString() method that overrides toString() in the superclass Person 
   //FIXME - this is the default toString override method.  Check assignment to see if it needs to be modified. 

    
	@Override 
	public String toString() {
		//FIXME - fix the formatting
		return "Employee [eID=" + eID + ", empStatus=" + empStatus + ", fName=" + fName + ", lName=" + lName
				+ ", address=" + address + "]";
	}






    
    
	
}
