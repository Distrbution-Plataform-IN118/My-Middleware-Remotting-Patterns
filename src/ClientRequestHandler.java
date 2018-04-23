import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class ClientRequestHandler {

	private String host;
	private int port;
	private int sentMessageSize;
	private int receiveMessageSize;
	
	private Socket clientSocket = null;
	private DataOutputStream outToServer = null;
	private DataInputStream inFromServer = null;
	
	public ClientRequestHandler(String host, int port){
		this.host = host;
		this.port = port;
	}
	
	public void send(byte [] msg )throws IOException {
		
	}
	
	public byte[] receive() throws IOException{
		return null;
		
	}
		
}
