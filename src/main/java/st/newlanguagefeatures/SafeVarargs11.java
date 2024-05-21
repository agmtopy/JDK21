package st.newlanguagefeatures;

import java.util.Arrays;
import java.util.List;

/**
 * 作用:@SafeVarargs功能增强,支持私有方法上注解
 * 适用:类型检查
 * 建议:不建议
 */
public class SafeVarargs11 {
    // 这其实不是一个安全的类型检查
    @SafeVarargs
    private void m(List<String>... lists) {
        // 先会存储到 array[0] 的位置
        Object[] array = lists;
        List<Integer> tmpList = Arrays.asList(42);
        // array[0] 又保存了tmpList(Integer)进行覆盖
        // tmpList是一个List对象（类型已经擦除），赋值给Object类型的对象是允许的（向上转型），
        // 能够编译通过
        array[0] = tmpList;
        // 实际取出来的应该是 42
        String s = lists[0].get(0);
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one", "two");
        new SafeVarargs11().m(list1);
    }
}
