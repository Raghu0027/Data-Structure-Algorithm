public class Insertaele {

    public static void main(String[] args) {
        int[] arr = new int[6]; // size increased to 6 to insert one new element
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5; // current number of elements
        int pos = 2; // position where to insert (0-based index)
        int value = 99; // new element to insert

        // shift elements to the right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // insert value
        arr[pos] = value;
        n++;

        // print array
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

