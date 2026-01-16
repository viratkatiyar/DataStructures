package BinarySearch;
// this array can contain duplicates
public class SearchInRotatedSortedArray3 {
    public static void main(String[] args) {
       int[] nums = {2, 5, 6, 0, 0, 1, 2};
       int target = 4;
        System.out.println("is target Found : " + search(nums, target));
    }
    static boolean search(int[] nums, int target){
        int n = nums.length;
        int start = 0, end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return true;
            else if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start ++;
                end --;
            }
            else if(nums[mid] <= nums[end]){ // mid to end is sorted
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{ // start to mid is sorted
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}
