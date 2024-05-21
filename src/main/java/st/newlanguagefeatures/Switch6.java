package st.newlanguagefeatures;

/**
 * 作用:Switch有两个增强,第一是类型推断匹配模式,第二是语法增强break->yield
 * 适用:Switch的全部场景
 * 建议:适用
 */
public class Switch6 {

    public static void main(String[] args) {
        Switch6.switchYield("Dax");
        Switch6.switchMd(1);
    }

    private static void switchYield(String k) {
        System.out.println(
                switch (k) {
                    case "Foo","Dax":
                        yield 1;
                    case "Bar":
                        yield 2;
                    default:
                        System.out.println("Neither Foo,Dax nor Bar, hmmm...");
                        yield 0;
                }
        );
    }

    public static void switchMd(Object k) {
        System.out.println(
                switch (k) {
                    case Integer a -> "Integer";
                    case String b -> "String";
                    default -> "Exception...";
                }
        );
    }
}
