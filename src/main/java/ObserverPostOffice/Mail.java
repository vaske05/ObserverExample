package ObserverPostOffice;

public class Mail {
	
	String receiverMail;
	String address;
	String content;
	
	public Mail(String receiverName, String address, String contet) {
		this.receiverMail = receiverName;
		this.address = address;
		this.content = contet;
	}
	
	public String getReceiverMail() {
		return receiverMail;
	}

	public void setReceiverMail(String receiverMail) {
		this.receiverMail = receiverMail;
	}
	
	
}
