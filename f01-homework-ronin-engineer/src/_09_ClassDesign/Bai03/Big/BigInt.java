package _09_ClassDesign.Bai03.Big;

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("4512794561274895678291465874256891745697813465");
        BigInteger b = new BigInteger("11748985798571938478971873489317498137498134791837419387466451");

        System.out.println(a.divide(b));
    }
}
