package agh.po.lab3;

public class CodingBat {

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
    }


}


