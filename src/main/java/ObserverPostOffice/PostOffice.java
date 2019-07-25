package ObserverPostOffice;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject {
	
	private List<Mail> mailList;
	private List<Observer> observerList;
	
	public PostOffice() {
		mailList = new ArrayList<>();
		observerList = new ArrayList<>();
	}
	
	void addMail(Mail mail) {
		mailList.add(mail);
		Notify();
	}
	
	List<Mail> getMailList() {
		return mailList;
	}

	@Override
	public void Attach(Observer o) {
		observerList.add(o);
	}

	@Override
	public void Dettach(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void Notify() {
		observerList.forEach(o -> o.update(this));
	}
}
