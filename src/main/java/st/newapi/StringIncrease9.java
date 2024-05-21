package st.newapi;

import org.junit.Assert;

import java.util.HexFormat;

import static org.junit.Assert.assertEquals;

/**
 * 作用:字符串功能增强
 * 适用:对字符串的操作
 * 建议:建议
 */
public class StringIncrease9 {
    public static void main(String[] args) {

        //1. 增加isBlank
        String str = "\r\n";
        assertEquals(str.isBlank(), true);
        assertEquals("".isBlank(), true);

//        assertEquals(str.isEmpty(), true);
//        assertEquals("".isEmpty(), true);

        //2. 按照换行符进行分割成流
        String str2 = "第一行\r\n第二行\r\n第三行";
        assertEquals(str2.lines().count(), 3l);

        //3. 重复
        assertEquals("a".repeat(3), "aaa");

        //4. 去掉首尾空白
        assertEquals(" a ".strip(), "a");
    }
}
