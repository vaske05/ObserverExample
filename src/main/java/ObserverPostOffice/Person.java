package ObserverPostOffice;

import java.util.List;

public class Person implements ObserverPostOffice.Observer {
	
	String fullName;
	
	public Person(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public void update(Object obj) {
		if(obj instanceof PostOffice) {
			PostOffice postOffice = (PostOffice) obj;
			checkMail(postOffice.getMailList());
		}
	}

	private void checkMail(List<Mail> mailList) {
		for (int i = 0; i < mailList.size(); i++) {
			if( fullName.compareTo(mailList.get(i).getReceiverMail()) == 0 ) {
				System.out.println("---------");
				System.out.println("From: " + mailList.get(i).address);
				System.out.println("To: " + fullName);
				System.out.println("Message: " + mailList.get(i).content);
				System.out.println("---------");
			}
		}
	}
	
}
