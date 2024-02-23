package Movie_Ticket;
import java.util.Scanner;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name");
		String name=sc.next();
		System.out.println("Enter no of bookings");
		int n=sc.nextInt();
		System.out.println("Enter the available tickets");
		int tic=sc.nextInt();
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the ticketid");
			int tid=sc.nextInt();
			System.out.println("Enter the price");
			int p=sc.nextInt();
			System.out.println("Enter the no of tickets");
			int nt=sc.nextInt();
			System.out.println("Available tickets: "+tic);
			Ticket t = new Ticket();
			int ta=t.calTiCo(nt);
			if(ta!=-1) {
				System.out.println("Total amount:"+ta);
			}
			if(nt>tic) {
				System.out.println("Tickets are not available");
			}
			if(tic==0) {
				System.out.println("House full");
			}
			else
			System.out.println("Available ticket after booking: "+(tic-nt));
		}
		
		
		
		
		
	}

}
