import java.util.InputMismatchException;
import java.util.Scanner;

public class B3_ExceptionCase {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		try {
		System.out.println("a/b..a?");
		int b=a.nextInt();
		
		System.out.println("a/b..b?");
		int c=a.nextInt();
		
		System.out.printf("%d / %d = %d \n",b,c,b/c);
		}
		catch(ArithmeticException | InputMismatchException e) {
			e.getMessage();
		}
		System.out.println("Good bye~~!");

	}

}
