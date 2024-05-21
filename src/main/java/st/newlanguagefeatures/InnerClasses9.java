package st.newlanguagefeatures;

/**
 * 作用:钻石运算符支持匿名内部类
 * 适用:匿名内部类使用泛型进行推导时使用
 * 建议:不建议
 */
abstract class Geeks<T> {
    abstract T add(T num1, T num2);
}

public class InnerClasses9 {
    public static void main(String[] args)
    {
        Geeks<Integer> obj = new Geeks<>() {
            Integer add(Integer n1, Integer n2)
            {
                return (n1 + n2);
            }
        };
        Integer result = obj.add(10, 20);
        System.out.println("Addition of two numbers: " + result);
    }
}
