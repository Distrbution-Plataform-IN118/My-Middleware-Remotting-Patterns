import java.io.Serializable;


public class ClientProxy implements Serializable{

	protected String host;
	protected int port;
	protected int objectId;
	
	
	
	
	public ClientProxy(final int port) {
		super();
		this.port = port;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getObjectId() {
		return objectId;
	}
	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}
	
	
	
	
}
