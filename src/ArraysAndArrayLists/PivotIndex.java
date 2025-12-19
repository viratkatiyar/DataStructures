package ArraysAndArrayLists;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int totalSum = 0;
        for(int k : nums){
            totalSum += k;
        }
        System.out.println(totalSum);
        int idx = -1;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < i; j++){
                sum += nums[j];
            }
            if(sum == (totalSum - sum - nums[i])){
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
