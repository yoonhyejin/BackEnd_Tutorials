import java.io.FileWriter;
import java.io.IOException;

public class MyException {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("./data.txt");
		throw new RuntimeException("다시읽어봐~~~~.");
		
	}

}
