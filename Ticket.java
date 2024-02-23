package Movie_Ticket;

public class Ticket {
	private int tid;
	private int price;
	private static int att;
	
	public int getId() {
		return tid;
	}
	public int getPrice() {
		return price;
	}
	public static int getAt() {
		return att;
	}
	public void setId(int tid) {
		this.tid=tid;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public static void setAt(int att) {
		att=att;
	}
	public int calTiCo(int nt) {
		
		if(att>=nt) {
			int t = nt*price;
			return t;
			
	}else if(att<0 || att<nt){
		return -1;
	}
		return 0;
}
}