package st.newlanguagefeatures;

/**
 * 作用:NPE异常信息增强
 * 适用:全场景
 * 建议:默认开启
 */
public class NPEHelpful5 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.b.b);
    }

    static class A{
        String a;
        B b;
    }

    static class B{
        String a;
        C b;
    }

    static class C{
        String a;
        B b;
    }

}
