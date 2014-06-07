import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


public class Main {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 81);
        OutputStream os = s.getOutputStream();
        os.write("exit".getBytes());
    }
}
