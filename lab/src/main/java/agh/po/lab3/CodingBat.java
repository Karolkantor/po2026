package agh.po.lab3;

import java.util.Map;
import java.util.HashMap;

public class CodingBat {


    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");

            if (a.length() > b.length()) {
                map.put("c", a);
            } else if (b.length() > a.length()) {
                map.put("c", b);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String s : strings) {
            String first = s.substring(0, 1);
            String last = s.substring(s.length() - 1);
            result.put(first, last);
        }
        return result;
    }

    public int sum13(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(i==0){
                if(nums[i]!=13){
                    sum+=nums[i];
                }
            }
            else if(nums[i]!=13 && nums[i-1]!=13){
                sum+=nums[i];
            }
        }
        return sum;
    }

    public boolean array123(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }


    public boolean has271(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val+5) &&
                    Math.abs(nums[i+2] - (val-1)) <= 2) {
                return true;
            }
        }

        return false;
    }

    public String helloName(String name) {
        return ("Hello "+ name+ "!");
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        System.out.println(cb.sum13(new int[]{1,2,2,13,2,1,7}));

        System.out.println(cb.has271(new int[]{1,2,2,7,1}));

        System.out.println(cb.helloName("Andrzej"));

        System.out.println(cb.array123(new int[]{1,2,2}));

        System.out.println(cb.firstHalf("Hello2"));

        System.out.println(cb.mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))));
    }


}


