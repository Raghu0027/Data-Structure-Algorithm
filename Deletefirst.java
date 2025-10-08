public class Deletefirst {
   
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] updated = new int[original.length - 1];
        for (int i = 1; i < original.length; i++) {
            updated[i - 1] = original[i];
        }
        for (int num : updated) {
            System.out.print(num + " ");
        }
    }
}

