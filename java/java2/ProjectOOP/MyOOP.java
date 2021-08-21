class Print {
	public String delimiter = "";
	public Print(String delimiter) { // constructor
		this.delimiter = delimiter;
	}
	
	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
		
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
		
	}

}


public class MyOOP {

	public static void main(String[] args) {
		Print p1 = new Print("----");
		Print p2 = new Print("****");
		
		p1.A();
		p1.B();
		
		p2.A();
		p2.B();
		
		
		
	}
	
}