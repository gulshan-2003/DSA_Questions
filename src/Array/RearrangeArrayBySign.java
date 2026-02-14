package Array;

import java.util.*;
public class RearrangeArrayBySign {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        // Lists to store positives and negatives separately
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        // Separate elements
        for (int num : arr) {
            if (num >= 0) {   // 0 is considered positive
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }
        int i = 0, p = 0, neg = 0;
        // Alternate placing positive and negative
        while (p < positives.size() && neg < negatives.size()) {
            arr[i++] = positives.get(p++);
            arr[i++] = negatives.get(neg++);
        }
        // Add remaining positives (if any)
        while (p < positives.size()) {
            arr[i++] = positives.get(p++);
        }
        // Add remaining negatives (if any)
        while (neg < negatives.size()) {
            arr[i++] = negatives.get(neg++);
        }
    }
    // Driver Code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
