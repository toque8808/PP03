package PP03;


public class PayRecord {
	
	private int rID;
    private Employee employee;
    private PayPeriod payPeriod;
    private TaxIncome payTax;
    
    private double payHours;
    private double payRate;
    
    private double montlyIncome;
    private int numMonths;
    
       
    
    public static final int REG_HOURS = 40;
    public static final double OT_RATE = 1.25;
    
    // pay record constructor for hourly employee
    public PayRecord(int id, Employee e, PayPeriod period, double hours, double rate){
    	
    	this.rID = id;
    	this.employee = e;
    	this.payPeriod = period;
    	this.payHours = hours;
    	this.payRate = rate;
    	this.montlyIncome = 0;    
    	this.numMonths = 0;
    	this.payTax = new TaxIncome();
  
    }
    
    // pay record constructor for full time employee
    public PayRecord(int id, Employee e, PayPeriod period, double mIncome, int mNum){
 	
 	this.rID = id;
 	this.employee = e;
 	this.payPeriod = period;
 	this.payHours = 0;
 	this.payRate = 0;
 	this.montlyIncome = mIncome;   
 	this.numMonths = mNum;
 	this.payTax = new TaxIncome();

 }


  // 1- add setters and getters methods
    
    public int getrID() {
  		return rID;
  	}

  	public void setrID(int rID) {
  		this.rID = rID;
  	}

  	public Employee getEmployee() {
  		return employee;
  	}

  	public void setEmployee(Employee employee) {
  		this.employee = employee;
  	}

  	public PayPeriod getPayPeriod() {
  		return payPeriod;
  	}

  	public void setPayPeriod(PayPeriod payPeriod) {
  		this.payPeriod = payPeriod;
  	}

  	public TaxIncome getPayTax() {
  		return payTax;
  	}

  	public void setPayTax(TaxIncome payTax) {
  		this.payTax = payTax;
  	}

  	public double getPayHours() {
  		return payHours;
  	}

  	public void setPayHours(double payHours) {
  		this.payHours = payHours;
  	}

  	public double getPayRate() {
  		return payRate;
  	}

  	public void setPayRate(double payRate) {
  		this.payRate = payRate;
  	}

  	public double getMontlyIncome() {
  		return montlyIncome;
  	}

  	public void setMontlyIncome(double montlyIncome) {
  		this.montlyIncome = montlyIncome;
  	}

  	public int getNumMonths() {
  		return numMonths;
  	}

  	public void setNumMonths(int numMonths) {
  		this.numMonths = numMonths;
  	}
    
    
  // 2- add override method toString()
    
    
	@Override
	public String toString() {
		
		//FIXME - fix formatting? 
		//FIXME - Does the toString method below concatenate the Employee and PayPeriod object data? 
		return "PayRecord [rID=" + rID + ", employee=" + employee + ", payPeriod=" + payPeriod + ", payTax=" + payTax
				+ ", payHours=" + payHours + ", payRate=" + payRate + ", montlyIncome=" + montlyIncome + ", numMonths="
				+ numMonths + "]";
	}
    
    
    
  // 3- complete the code in the following methods: grossPay() and netPay()
    
    // complete the code to compute the gross pay for the employee based on the employee status
	//FIXME - how to do enumeration - can I use switch or do I need to use if statement?
	
	public double grossPay(){
		
		switch(employee.getEmpStatus())	{ // status is in another class
		case FullTime:	
			return numMonths * payRate;
		
		case Hourly:
			return (payHours * payRate) + ((payHours - 40) * OT_RATE);
			//FIXME - what if payHours is < 40?
	
		}// end switch
	
		return 0;  // FIXME - return statement?
	}// end method
    
	// complete the code in this method to compute the net pay of the employee after taxes (state and federal)
     public double netPay(){
    	 
    	switch(employee.empStatus())	{
    	case FullTime:
    		return grossPay() - compIncomeTax(); // FIXME
    	
    	}
    	 
		  return 0;
  }
  
 

}
