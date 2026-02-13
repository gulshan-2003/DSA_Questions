package Array;

public class AddingOneToArrayOfDigits {
    public static void main(String[] args) {

        int[] arr ={1,2,9};
        StringBuilder sb = new StringBuilder();

        for(int a :arr) sb.append(a);

        int result = Integer.parseInt(sb.toString())+1;

        System.out.println(result);
    }
}
