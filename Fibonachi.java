class Fibonachi {
    public static int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[]args){
        int n=5;
        for(int i=0; i<=n; i++){
            System.out.println(Fibonachi.fib(i));
        }
    }
}