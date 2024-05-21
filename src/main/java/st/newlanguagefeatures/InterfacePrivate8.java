package st.newlanguagefeatures;

/**
 * 作用:接口内部私有方法,用于隐藏接口内部实现细节
 * 适用:接口有默认动作实现的场景
 * 建议:建议
 */
public interface InterfacePrivate8 {

    default void bar(){
        System.out.println("Hello");
        baz();
    }

    /**
     * 私有方法修饰非静态实现
     */
    private void baz(){
        System.out.println(" Static World");
    }

    /**
     * 私有方法修饰静态实现
     */
    private static void staticBaz(){
        System.out.println(" World");
    }

}
