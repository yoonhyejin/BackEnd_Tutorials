
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println("Why you tryna divide by 0????");
		}
		System.out.println(3);

	}

}
