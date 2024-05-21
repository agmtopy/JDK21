package st.flowapi;

import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

/**
 * 服务端
 */
public class VideoStreamServer  extends SubmissionPublisher<VideoFrame> {
    public VideoStreamServer() {
        super(Executors.newSingleThreadExecutor(), 5);
    }
}
