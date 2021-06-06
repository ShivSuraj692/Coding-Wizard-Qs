import java.util.Scanner;
 
public class Q4 {
 
    public static void main(String args[]){
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
 
        int i=0, sqr = num*num;
        int temp =num; 

        while(temp>0){
            i++;
            temp=temp/10;
        }
 
        int lastSquareDigits = (int) (sqr%(Math.pow(10,i)));
 
        if(num == lastSquareDigits)
           
        	System.out.println("It is an Automorphic number");
        else
            
        	System.out.println("It is not an Automorphic number");
    }
} 