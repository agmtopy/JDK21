package st.newapi;

import java.util.HexFormat;

import static org.junit.Assert.assertEquals;

/**
 * 作用:16进制转换
 * 适用:16进制转换
 * 建议:建议
 */
public class HexFormat5 {

    public static void main(String[] args) {
        assertEquals("0000007b",HexFormat.of().toHexDigits(123));
        assertEquals(123,HexFormat.of().fromHexDigits("0000007b"));
    }
}
