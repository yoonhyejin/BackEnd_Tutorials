class Accounting {
	public double valueOfSupply;
	
	public static double vatRate = 0.1;
	
	public Accounting (double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
		
	}
	
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	
}

public class AccountingApp {
	
	public static void main(String[] args) {
		
		Accounting a1 = new Accounting(100000.0);
		Accounting a2 = new Accounting(20000.0);
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("Total : " + a1.getTotal());
		
		

	}

}
