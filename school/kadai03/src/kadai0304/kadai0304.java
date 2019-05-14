package kadai0304;

import java.util.Scanner;

public class kadai0304 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bonus bonus = new Bonus();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number -->");
		String number = scanner.next();
		System.out.println("Pay -->");
		int pay = scanner.nextInt();
		System.out.println("Rank -->");
		int rank = scanner.nextInt();
		System.out.println("PaiedLeave -->");
		int paiedLeave = scanner.nextInt();
		System.out.println("Absence -->");
		int absence = scanner.nextInt();
		
		bonus.setNumber(number);
		bonus.setPay(pay);
		bonus.setRank(rank);
		bonus.setPaiedLeave(paiedLeave);
		bonus.setAbsence(absence);
		
		System.out.println();
		System.out.println("Number : " + bonus.getNumber());
		System.out.println("Pay : " + bonus.getPay());
		System.out.println("Rank : " + bonus.getRank());
		System.out.println("PaiedLeave : " + bonus.getPaiedLeave());
		System.out.println("Absence : "  + bonus.getAbsence());
		System.out.println("Bonus : " + bonus.getBonus());
				
	}
}
