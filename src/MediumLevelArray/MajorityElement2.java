package MediumLevelArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {

        int [] arr = {2,2,3,1,3,3,2,1,1};
        int n = arr.length;

        HashMap<Integer,Integer> map= new HashMap<>();
        List<Integer> li = new ArrayList<>();

        for(int a : arr)
        {
            map.put(a, map.getOrDefault(a,0)+1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() >= n / 3) {
                li.add(e.getKey());
            }
        }
        System.out.println(li);
    }
}
