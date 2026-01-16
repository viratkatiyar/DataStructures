package BinarySearch;
/*
A new racing track for kids is being built in New York with 'n' starting spots.
The spots are located along a straight line at positions xl, x2... xn(xi <=10^9).
For each 'i', xi+1 > xi.
At a time only 'm' children are allowed to enter the race. Since the racetrack is for kids,
 they may run into each other while running. To prevent this, we want to choose the
 starting spots such that the minimum distance between any two of them is as
 large as possible. What is the largest minimum distance?

The first line of input will contain the value of n, the number of starting spots.
The second line of input will contain the n numbers denoting the location of each spot.
The third line will contain the value of m, number of children.
Input
5
12489
3
Output
3
 */
public class RacingTrackHardProblem {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8, 9};
        int m = 3;
        System.out.println(raceTrack(a, m));
    }
    static int raceTrack(int[] a, int m){
        if(m > a.length) return -1;
        int st = 0, end = (int)1e9;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(isPossible(a, m, mid)){ //can k kids be placed such that no 2 kids have distance lesser
                // than mid
                ans = mid;
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] a, int m, int dist){
        int kidsPlaced = 1;
        int lastKid = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] - lastKid >= dist){
                kidsPlaced++;
                lastKid = a[i];
            }
        }
        return kidsPlaced >= m;
    }
}
