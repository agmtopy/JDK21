package st.newlanguagefeatures;

/**
 * 作用:""" json """,文本块标识,主要用于处理含有转义字符的文本
 * 适用:涉及转移字符的场景
 * 是否建议:建议
 */
public class TextBlock4 {

    private static String text = """
            {
              "name": "Alice",
              "age": 25,
              "city": "Los Angeles"
            }
            """;

    public static void main(String[] args) {
        System.out.println(text);
    }
}
