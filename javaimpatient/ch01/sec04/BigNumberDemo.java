package ch01.sec04;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberDemo {
    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(876543210123456789L);
        BigInteger k = new BigInteger("9876543210123456789");
        BigInteger r = BigInteger.valueOf(5).multiply(n.add(k)); // r = 5 * (n + k)
        System.out.println(r);
        System.out.println(2.0 - 1.1);
        BigDecimal d = BigDecimal.valueOf(2, 0).subtract(BigDecimal.valueOf(11, 1));
        System.out.println(d);
    }
}
