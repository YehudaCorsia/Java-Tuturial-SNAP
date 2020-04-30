
import java.util.Random;
import java.util.Scanner;
   	
public class main {
    	
   	public static void main(String[] args) {
 
          	Scanner in = new Scanner (System.in);
          	Random r = new Random();
          	
          	int NumberZugi = 0, NumberNotZugi =0 ;
          	
          	int[] grades = new int[100];
          	for(int i = 0; i<grades.length; i++){
                 	grades[i] = r.nextInt(100) + 1;
 
          	}
          	
          	for(int i=0 ; i<grades.length ; i++){
                 	System.out.println(grades[i]);

                 	if(grades[i] % 2 == 0){
                       	NumberZugi++ ;
          	}  	else{ NumberNotZugi++;
                       	}                      	
          	
          	}
System.out.println(" the number zugi is: " + NumberZugi  );  
System.out.println( "the number is not zugi is " + NumberNotZugi);     	
 
          	in.close();  
   	}
}