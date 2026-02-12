package Array;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int thirdLargest = findThirdLargest(arr);
        System.out.println("The third largest element is: " + thirdLargest);
    }

    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must have at least three elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != secondLargest && num != largest) {
                thirdLargest = num;
            }
        }

        if (thirdLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no third largest element");
        }

        return thirdLargest;
    }
    
}
