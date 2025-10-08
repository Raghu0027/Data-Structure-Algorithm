public class NaturalReverse1 {
    static int num(int n){
        if(n<1){
            return 1 ;
        }
        System.out.println(n);
        return num(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(NaturalReverse1.num(n));
    }
}