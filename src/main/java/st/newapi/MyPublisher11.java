package st.newapi;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * 作用:Flow API实现异步的发布-订阅模式
 * 适用:发布-订阅场景
 * 建议:建议
 */
public class MyPublisher11 {
    public static void main(String[] args) throws InterruptedException {

        // 创建一个 SubmissionPublisher，作为发布者
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        // 创建一个订阅者
        Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                // 订阅时请求一个数据
                subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                // 处理接收到的数据
                System.out.println("收到数据：" + item);
                // 请求下一个数据
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                // 发生错误时的处理逻辑
                throwable.printStackTrace();
            }

            @Override
            public void onComplete() {
                // 数据流结束时的处理逻辑
                System.out.println("数据流结束");
            }
        };

        // 订阅发布者
        publisher.subscribe(subscriber);

        // 发布一些数据
        publisher.submit("第一条数据");
        publisher.submit("第二条数据");
        publisher.submit("第三条数据");

        // 等待一段时间，模拟数据流结束
        Thread.sleep(1000);

        // 关闭发布者
        publisher.close();
    }
}
