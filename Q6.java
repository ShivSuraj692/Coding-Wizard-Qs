import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

 Scanner sc =new Scanner(System.in);
 System.out.println("Enter 1st two numbers:");
 int a=sc.nextInt();
 int b=sc.nextInt();
 
 if (a>b) {
	System.out.println("Enter the Third number");
	b=sc.nextInt();
	if (a>b) {
		System.out.println("Maximum is :"+a);
	}else {
		System.out.println("Maximum is :"+b);
	}
	
}
 else {
	 System.out.println("Enter the Third number:");
		a=sc.nextInt();
		if (b>a) {
			System.out.println("Maximum is :"+b);
		}
		else {
			System.out.println("Maximum is :"+a);
		}
		
      }
   }
}
