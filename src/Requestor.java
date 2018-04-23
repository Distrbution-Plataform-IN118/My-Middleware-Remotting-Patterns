
public class Requestor {

	public Termination invoke(Invocation inv) {
		// TODO Auto-generated method stub
		ClientRequestHandler crh = new ClientRequestHandler(
				inv.getClientProxy().getHost(), inv.getClientProxy().getPort());
		Marshaller marshaller = new Marshaller();
		Termination termination = new Termination();
		byte[] msgMarshalled = new byte [1024];
		Message msgUnMarshalled = new Message();
		Message msgToBeMarshalled = new Message();
		byte[] msgToBeUnMarshalled = new byte [1024];
		
		RequestHeader requestHeader = new RequestHeader("", 0, true, 0, inv.getOperetionName());
		RequestBody requestBody = new RequestBody(inv.getParameters());
		MessageHeader messageHeader = new MessageHeader("MIOP", 0, false, 0,0);
		MessageBody messageBody = new MessageBody(requestHeader, requestBody, null,null);
		Message msgToBeMarShalled = new Message(messageHeader, messageBody);
		
		msgMarshalled = marshaller.marshall(msgToBeMarshalled);
		
		crh.send(msgMarshalled);
		msgToBeUnMarshalled= crh.receive();
		
		msgUnMarshalled = marshaller.unmarshall(msgToBeMarShalled);
		
		termination.setResult(msgUnMarshalled.getBody().getReplyBody().getOperationResult());
		
		
		return null;
	}

}
