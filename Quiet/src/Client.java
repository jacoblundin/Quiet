import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client {
	public static void main(String arg[]) throws IOException{
		String str = "hej";
		Socket socket = new Socket("Localhost", 4555);
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()))) {
			oos.writeObject(str);
			oos.flush();
		} catch (IOException e) {}
				
	}
}
