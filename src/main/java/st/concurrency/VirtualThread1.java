package st.concurrency;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * 作用:虚拟线程
 * 适用:网络程序
 * 建议:暂定
 */
public class VirtualThread1 {

    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    return i;
                });
            });
        }
    }
}
