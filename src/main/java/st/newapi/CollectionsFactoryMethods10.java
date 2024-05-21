package st.newapi;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 作用: 对集合进行初始化
 * 适用:
 * 建议:建议
 */
public class CollectionsFactoryMethods10 {

    public static void main(String[] args) {
        Set<Integer> mySet = Set.of(1, 2, 3);
        List<Integer> myList = List.of(1, 2, 3);
        Map<String, Integer> myMap = Map.of("one", 1, "two", 2);
    }

}
