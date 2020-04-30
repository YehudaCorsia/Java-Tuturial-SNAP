
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
		case 2:
		case 3:
			p(" this number is small! ");
			break;
			
		case 4:
		case 5:
		case 6:
			p(" this number is medium! ");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			
			p(" This number is big.! ");
			break;
			default:
				System.out.println("the number is weird :P ");
			
			
		
		}
				
		
		in.close();
		
		
	}
	
	public static void p(String s){
		System.out.println(s);
	}
	
	}