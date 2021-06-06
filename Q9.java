import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s, reverse = "";
		    Scanner sc= new Scanner(System.in);

		    System.out.println("Enter a string to reverse");
		    s = sc.nextLine();

		    int length = s.length();

		    for (int i = length - 1 ; i >= 0 ; i--)
		      reverse = reverse + s.charAt(i);

		    System.out.println("Reverse of the string: " + reverse);

	}

}
