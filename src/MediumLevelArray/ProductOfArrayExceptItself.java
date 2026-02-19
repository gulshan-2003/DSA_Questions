package MediumLevelArray;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = {10,3,5,6,2};
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: left product
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: right product and multiply
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        for(int a : result)
        {
            System.out.println(a);
        }
    }
}
