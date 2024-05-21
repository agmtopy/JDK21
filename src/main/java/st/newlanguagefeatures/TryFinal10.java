package st.newlanguagefeatures;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Selector;

/**
 * 作用:try支持final类型变量以及接受参数方式改变
 * 适用:try-with-resources语句
 * 建议:建议
 */
public class TryFinal10 {

    public static void main(String[] args) throws IOException {
        final InetSocketAddress birthPort = new InetSocketAddress(1989);
        DatagramChannel udpServer = DatagramChannel.open().bind(birthPort);
        Selector selector = Selector.open();
        try (udpServer;selector) {
            // go non-blocking and register channel with selector
            udpServer.receive(ByteBuffer.allocate(1024));
            // Process the packet
        } catch (Exception e) {
            // handle the exception
        }
    }
}
