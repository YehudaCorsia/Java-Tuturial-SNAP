
import java.util.Scanner;
import java.util.Random;

public class main {

	
	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int number;
		System.out.println(" Please enter number");
		
		number = in.nextInt();
		
		switch(number){
		
		case 1:
			p(" One ");
			break;
			
		case 2:
			p(" two ");
			break;
		case 3:
			p(" Three ");
			break;
			default:
				System.out.println("the number is greater then 3 or smaller then 1 ");
			
			
		
		}
				
		
		in.close();
		
		
	}
	
	public static void p(String s){
		System.out.println(s);
	}
	
	}