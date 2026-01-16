package BinarySearch;
// follow-up question : Search in a 2d matrix 2 (leetcode 240)
public class SearchIn2DMatrix {
    static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 17;
        System.out.println("Target Found : " + searchMatrix(matrix, target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m * n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midElt = matrix[mid / n][mid % n];
            if(target == midElt){
                return true;
            }
            else if(target > midElt){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
