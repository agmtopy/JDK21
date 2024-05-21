package st.newapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 作用:stream to list
 * 适用:stream to list
 * 建议:建议
 */
public class StreamToList6 {

    public static void main(String[] args) {
        List<String> result1 = Stream.of("one", "two", "three")
                .filter(s -> s.length() == 3)
                .toList();

        List<String> result2 = result1.stream().collect(Collectors.toList());
    }
}
