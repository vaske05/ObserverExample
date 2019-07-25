package ObserverPostOffice;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {
	
	private List<Mail> mailList;
	
	public PostOffice() {
		mailList = new ArrayList<>();
	}
	
	void addMail(Mail mail) {
		mailList.add(mail);
	}
	
	List<Mail> getMailList() {
		return mailList;
	}

}
