package st.newapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 作用:查找两个集合中不匹配的元素
 * 适用:集合差集的场景
 * 建议:建议
 */
public class ArraysMismatch12 {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3);
        List<Integer> list2 = List.of(2,3,4);

        assertEquals(Arrays.mismatch(list1.toArray(),list2.toArray()), 2);;
    }
}
