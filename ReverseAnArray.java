public class ReverseAnArray {
    public static void prit(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[] = {2,23,45,56,89,98,120,150};
        int n= arr.length;
        prit(arr);
        int i=0;
        int j=n-1;
        while (i<j) {
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;j--;
        }
            prit(arr);
    }
    
}
