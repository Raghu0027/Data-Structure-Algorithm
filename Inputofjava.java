import java.util.*;
public class Inputofjava {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of array");
         int n = sc.nextInt();
         int arr[] = new int[n];

         System.out.println("enter the elements in java");
         //input
         for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
         }
         // output
         for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
         }
    }
    }
    

