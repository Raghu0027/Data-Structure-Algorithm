import java.util.*;
public class Maxarray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size=sc.nextInt();
      int number[]  = new int[size];
//input of array
      for(int i=0; i<size; i++){
           number[i]=sc.nextInt();
      }

      int maxi=number[0];
      for(int i=0; i<size; i++){
        if(number[i]>maxi){
            maxi =number[i];
        }
      }
System.out.println(maxi);

    }
    
}


