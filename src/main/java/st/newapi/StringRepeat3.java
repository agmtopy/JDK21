package st.newapi;

/**
 * 作用:重复打印指定字符
 * 适用: 暂无
 * 建议: 不建议
 */
public class StringRepeat3 {

    public static void main(String[] args) {
        String width = new StringBuilder("width")
                .append("->".repeat(3))
                .toString();

        System.out.println("width = " + width);
    }
}
