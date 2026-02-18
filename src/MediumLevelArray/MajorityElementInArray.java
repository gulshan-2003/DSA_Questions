package MediumLevelArray;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementInArray {
    public static void main(String[] args) {

        int [] arr = {1,1,2,1,3,5,1};
        int n = arr.length;

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int a : arr)
        {
            map.put(a, map.getOrDefault(a,0)+1);
        }

        int key =0;
//        int max = 0;
        boolean x = false;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > n / 2) {
                System.out.println(e.getKey());
                return;
            }
        }
        System.out.println("-1");

//        if(x)
//        {
//            System.out.println(key);
//        }
//        else{
//            System.out.println("-1");
//        }
    }
}
