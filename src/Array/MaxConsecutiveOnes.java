package Array;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,1,1};
        int count =1;
        int maxCount =1;
        for(int i =1; i<arr.length; i++)
        {
            if(arr[i] == arr[i-1])
            {
                count++;
            }
            else{

                count =1;
            }
            maxCount = Math.max(count, maxCount);
        }
        System.out.println(maxCount);
    }
}
