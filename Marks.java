public class Marks {
    public static void main(String[] args) {
        int marks[] = {12,42,56,67,31,21,23,45,7};
        for(int i=0; i<marks.length; i++){
            if(marks[i]<35){
                System.out.println(i);
            }

        }
        System.out.println("this index student are fail in test.");

    }
    
}
