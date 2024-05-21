package st.newapi;

import org.springframework.util.Assert;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * 作用:返回[最小值,最大值]范围内的值
 * 适用: long/int/double类型
 * 建议:不建议
 */
public class MathClamp2 {
    public static void main(String[] args) {
        assertEquals(17, Math.clamp(15, 17, 98));
        assertEquals(98, Math.clamp(100, 17, 98));
    }

}
