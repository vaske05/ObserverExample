package ObserverPostOffice;

public class Main {

	public static void main(String[] args) {
		
		PostOffice postOfficeNis = new PostOffice();
		Mail mail1 = new Mail("Milan Vasic", "Petar Peric", "Zdravo Milane, kako si? Pozdrav, Petar.");
		Mail mail2 = new Mail("Petar Peric", "Milan Vasic", "Zdravo Petre, dobro sam, kako si ti? Lep pozdrav, Milan.");
		
		Person person1 = new Person("Milan Vasic");
		Person person2 = new Person("Petar Peric");
		
		postOfficeNis.Attach(person1);
		postOfficeNis.Attach(person2);
		
		postOfficeNis.addMail(mail1);
		postOfficeNis.addMail(mail2);
		

	}

}
