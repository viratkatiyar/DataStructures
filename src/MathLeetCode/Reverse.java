package MathLeetCode;

public class Reverse {
    public static void main(String[] args) {
        int x = -123;
        int reverse = 0;
        int nd = 0;
        int temp = x;
        while(temp != 0){
            temp /= 10;
            nd++;
        }
        System.out.println(nd);
        while(x != 0){
            int d = x % 10;
            reverse += d * (int)Math.pow(10, nd - 1);
            nd --;
            x /= 10;
        }
        if(reverse >= Integer.MAX_VALUE || reverse <= Integer.MIN_VALUE){
            reverse = 0;
        }
        System.out.println(reverse);
    }
}
