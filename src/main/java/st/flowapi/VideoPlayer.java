package st.flowapi;

import java.util.concurrent.Flow;

public class VideoPlayer implements Flow.Subscriber<VideoFrame> {
    Flow.Subscription subscription = null;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(VideoFrame item) {
        System.out.println(String.format("play %s", item.getNumber()));
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(String.format("There is an error in video streaming: %s", throwable.getMessage()));
    }

    @Override
    public void onComplete() {
        System.out.println(String.format("Video has ended"));
    }
}
