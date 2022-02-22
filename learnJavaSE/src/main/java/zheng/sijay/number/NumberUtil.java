package zheng.sijay.number;

import java.math.BigDecimal;

/**
 * @author 郑世杰
 */
public class NumberUtil {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("123.456");
        BigDecimal b = new BigDecimal("654.321");
        BigDecimal c = a.add(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}