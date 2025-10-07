import java.util.Scanner;
public class Creat2darray {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the rows");
		int rows = sc.nextInt();
		
	System.out.print("enter the colms");
		int colms = sc.nextInt();
		int [][] arr= new int[rows][colms];
		
		for( int i=0; i<rows; i++){
		    for( int j=0; j<colms; j++){
		        arr[i][j] = sc.nextInt();
		    }
		}
			for( int i=0; i<rows; i++){
		    for( int j=0; j<colms; j++){
		        System.out.print(arr[i][j] + " ");
		    }
		     System.out.println();
		}
		
	}
}
    

