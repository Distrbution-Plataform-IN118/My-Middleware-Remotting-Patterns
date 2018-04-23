import java.io.Serializable;


public class Message implements Serializable {
	
	private MessageHeader header;
	private MessageBody body;
	
	public Message(MessageHeader messageHeader, MessageBody messageBody) {
		// TODO Auto-generated constructor stub
		this.header = messageHeader;
		this.body = messageBody;
	}

	public Message() {
		// TODO Auto-generated constructor stub
	}

	public MessageBody getBody() {
		// TODO Auto-generated method stub
		return null;
	}

}
