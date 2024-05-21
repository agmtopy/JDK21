package st.newapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingInt;

/**
 * 作用:将一个集合进行两种操作后聚合结果并进行返回
 * 适用:对list的两种动作进行同时操作
 * 建议:建议
 */
public class CollectorsTeeing8 {

    public static void main(String[] args) {
        CountSum countsum = Stream.of(2, 11, 1, 5, 7, 8, 12)
                .collect(Collectors.teeing(
                        counting(),
                        summingInt(e -> e),
                        CountSum::new));

        System.out.println(countsum.toString());
    }
}

class CountSum {
    private final Long count;
    private final Integer sum;
    public CountSum(Long count, Integer sum) {
        this.count = count;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "CountSum{" +
                "count=" + count +
                ", sum=" + sum +
                '}';
    }
}

