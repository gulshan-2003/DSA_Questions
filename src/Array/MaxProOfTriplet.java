package Array;

import java.util.Arrays;

public class MaxProOfTriplet {
    public static void main(String[] args) {
        int[] arr = {10,3,5,6,20};
//        int max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        int n =arr.length;
        int product1 = arr[n-1] * arr[n-2] * arr[n-3];
        System.out.println(product1);
    }

}
