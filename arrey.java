import java.util.*;

public class arrey {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        int leftIndex = 0, rightIndex = arr.length - 1;
        int temp;

        while (leftIndex < rightIndex)
        {
            temp = arr[leftIndex];
            if(arr[leftIndex]==0) {
                arr[leftIndex++] = arr[leftIndex];
                arr[leftIndex] = temp;

            }
          else{

               leftIndex = leftIndex++;

           }
       }
    }
}
