import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        		
		Scanner in = new Scanner(System.in);
		
		int [][]  matrix = new int [10][10];
		

		for (int i = 0 ; i<matrix.length ; i++ ){
			for (int j = 0 ; j <matrix[i].length ; j++ ){
			matrix[i][j] = i+j ;
			}
		}
		
		for (int i = 0 ; i<matrix.length ; i++ ){
			for (int j = 0 ; j <matrix[i].length ; j++ ){
				
		 System.out.print( matrix [i][j] + "\t"); 		
			}
				
			System.out.println();
		}
	}

}
