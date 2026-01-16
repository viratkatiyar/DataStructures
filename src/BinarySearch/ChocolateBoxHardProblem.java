package BinarySearch;
/*
        You have 'n' (n <= 10^5) boxes of chocolate. Each box contains a[i] a[i] <= 10000) chocolates.
        You need to distribute these boxes among 'm' students such that
        the maximum number of chocolates allocated to a student is minimum.
a)One box will be allocated to exactly one student.
b)All the boxes should be allocated.
c)Each student has to be allocated at least one box.
d)Allotment should be in contiguous order, for instance,
a student cannot be allocated box 1 and box 3, skipping box 2.
Calculate and return that minimum possible number.

Assume that it is always possible to distribute the chocolates.
The first line of input will contain the value of n, the number of boxes.
The second line of input will contain the n numbers denoting the number of chocolates in each box.
The third line will contain the m, number of students.
Input : 4
12 34 67 90
2
Output : 113
*/
public class ChocolateBoxHardProblem {
    public static void main(String[] args) {
        int[] a = {12, 34, 67, 90};
        int m = 2;
        System.out.println(distributeChocolates(a, m));
    }
    static int distributeChocolates(int[] a, int m){
        if(a.length < m) return -1; // students greater than boxes
        int ans = 0, st = 1, end = (int)1e9;

        while(st <= end){
            int mid = st + (end - st) / 2;
            if(isDivisionPossible(a, m, mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return ans;
    }
    static boolean isDivisionPossible(int[] a, int m, int maxChocolateAllowed){
        int noOfStudents = 1;
        int choc = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > maxChocolateAllowed) return false;
            if(choc + a[i] <= maxChocolateAllowed) choc += a[i];
            else{
                noOfStudents ++;
                choc = a[i];
            }
        }
        return noOfStudents <= m;
//        if(noOfStudents > m) return false;
//        return true;
    }
}











