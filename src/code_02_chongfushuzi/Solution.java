package code_02_chongfushuzi;

import java.util.HashMap;

public class Solution {
    public void findChongfu(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                System.out.println(arr[i]);
            }else{
                map.put(arr[i],1);
            }
        }

    }
}
