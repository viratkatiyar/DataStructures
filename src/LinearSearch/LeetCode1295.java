package LinearSearch;

public class LeetCode1295 {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        System.out.println(findNumbers3(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int k : nums){
            int nd = 0;
            while(k != 0){
                k /= 10;
                nd ++;
            }
            if(nd % 2 == 0){
                count ++;
            }
        }
        return count;
    }
    static int findNumbers2(int[] nums){
        int count = 0;
        for(int k : nums){
            String temp = Integer.toString(k);
            if(temp.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
    static int findNumbers3(int[] nums){
        int count = 0;
        for(int k : nums){
            int nd = (int)Math.log10(k) + 1;
            if(nd % 2 == 0){
                count ++;
            }
        }
        return count;
    }
}
