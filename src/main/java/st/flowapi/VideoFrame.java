package st.flowapi;

/**
 * 视频帧
 */
public class VideoFrame {
    //帧数
    private long number;

    public VideoFrame(long andIncrement) {
        number = andIncrement;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
