package st.newlanguagefeatures;

/**
 * 作用:instanceof关键字,去掉类型检查后的显示转化
 * 适用:instanceof全部场景
 * 是否建议:建议
 */
public class Instanceof2 {

    public static void main(String[] args) {
        var obj = new Object();
        obj = "123456";
        if (obj instanceof String str && str.length() > 5) {
            System.out.println("str.length() > 5");
        }
    }
}
