
   	import java.util.Scanner;
   	
public class main {
 
   	
   	public static void main(String[] args) {
 
          	Scanner in = new Scanner (System.in);
          	
          	int grade,sum =0, count = 0 ;
          	double avg;
          	
          	System.out.println("Enter your grade number 1 ");
          	grade = in.nextInt();
          	
                       	
          	while(grade != -1){
          	count++;
          	sum += grade;
          	
          	
          	System.out.println("enter your grade number" + (count +1));
 
                 	grade = in.nextInt();
                 	
          	}
                       	
   	
          	
          	if(count !=0){
                 	avg = (double)sum/count;
                 	
                 	if( avg >=95){
                              	System.out.println(" your average is great " + avg );
          	}else if (avg >=75 &&  avg<95){
                 	System.out.println("your avg is ok");
          	
          	}else{
                 	System.out.println("your avg can to be batter");
          	}
          	
          	System.out.println("your AVG is "+ avg);
          	
          	System.out.println("your SUM is " + sum);
          	in.close();
   	}
   	}
}
 
