import java.util.Scanner;
 
public class Main {
   	public static void main(String[] args){
 
          	Scanner in = new Scanner(System.in);
          	
          	int number1, number2, sum, dif;
          	System.out.println("enter the first number");
          	number1 = in.nextInt();
          	System.out.println("enter the second number");
          	number2 = in.nextInt();
          	in.close();
          	sum = number1 + number2;
          	dif = number1 - number2;
          	System.out.println("the sum is " + sum + " !");
          	System.out.println("the dif is " + dif + " !");     	
   	}   	
}
