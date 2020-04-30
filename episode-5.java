import java.util.Scanner;
  
public class Main {
 
   	public static void main(String[] args){          	
           Scanner in = new Scanner(System.in);
          	
          	int grade,sum =0;
          	double avg;
          	
          	for(int i =1; i<=10; i++){
   	
                 	System.out.println(" Enter grade number" + i + ";");
                 	grade = in.nextInt();
                 	System.out.println("grade enteres successfully! " + grade);
                 	sum += grade;
          	}
          	
          	avg = (double)sum/10;
          	System.out.println("you final average is" + avg);  	
   	in.close();
   	}   	
}
