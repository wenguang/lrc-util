package bits.operation;

public class BitsShift {
    public static void main(String[] args) {
        int bits = 4;
        long n = -1L ^ (-1L << bits);   //4位二进制所能表示最大十进制数
        System.out.println(bits + "位二进制所能表示最大十进制数为" + n);

    }
}
