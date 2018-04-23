

public class MessageBody {
	private RequestHeader requestHeader;
	private RequestBody requestBody;
	private ReplyHeader replyHeader;
	private ReplyBody replyBody;
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(RequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}
	public RequestBody getRequestBody() {
		return requestBody;
	}
	public void setRequestBody(RequestBody requestBody) {
		this.requestBody = requestBody;
	}
	public ReplyHeader getReplyHeader() {
		return replyHeader;
	}
	public void setReplyHeader(ReplyHeader replyHeader) {
		this.replyHeader = replyHeader;
	}
	public ReplyBody getReplyBody() {
		return replyBody;
	}
	public void setReplyBody(ReplyBody replyBody) {
		this.replyBody = replyBody;
	}
	
	
}
