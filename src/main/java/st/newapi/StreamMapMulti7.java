package st.newapi;

import java.util.stream.Stream;

/**
 * 作用:代替 flatMap 方法
 * 适用:flatMap 适用场景
 * 建议:建议
 */
public class StreamMapMulti7 {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4)
                .mapMulti((number, downstream) -> downstream.accept(number))
                .forEach(System.out::print);
    }
}
