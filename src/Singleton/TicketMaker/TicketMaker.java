package Singleton.TicketMaker;

public class TicketMaker {
	private int ticket = 1000;
	synchronized private int getNextInstanceNumber() {
		return ticket++;
	}
	
	
	static TicketMaker singleton = new TicketMaker();
	private static TicketMaker getInstance() {
		return singleton;
	}
}
