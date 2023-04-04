package PP03;

public class TaxIncome implements Taxable {   	// 1- this class implements the Taxable interface
	
	//default constructor
	
	public TaxIncome()	{
		
	}
	
	// 2- implement all the unimplemented abstract methods in the Taxable Interface, income tax is computed based on state and federal taxes   
	
	@Override
	public double compStateTax(double grossPay) {
		double stateTax = grossPay * STATE_TAX;
		return stateTax;
	}

	@Override
	public double compFederalTax(double grossPay) {
		
		double federalTax = grossPay * FEDERAL_TAX;
		return federalTax;
	}

	@Override
	public double compIncomeTax(double grossPay) {
		return compStateTax(grossPay) + compFederalTax(grossPay);
		
	}
	
	

}
