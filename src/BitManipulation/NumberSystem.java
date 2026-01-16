package BitManipulation;

public class NumberSystem {
    static void main(String[] args) {
        int a = 45; // no prefix = decimal
        int b = 045; // 0 (Zero Prefix) = Octal
        int c = 0X45; // 0x or 0X prefix = Hexadecimal;
        int d = 0B101101; // 0b or 0B prefix = binary;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
