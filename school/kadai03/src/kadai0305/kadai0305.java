package kadai0305;

import java.util.Scanner;

public class kadai0305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Seiseki seiseki = new Seiseki();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("No -->");
		String no = scanner.next();
		
		System.out.println("Name -->");
		String name = scanner.next();
		
		System.out.println("Kamoku -->");
		String kamoku = scanner.next();
		
		System.out.println("Count -->");
		int count = scanner.nextInt();
		
		//score input
		int[] wTokuten = new int[count];
		for(int i = 0; i < count; i++) {
			System.out.println("test " + (i + 1) + " -->");
			wTokuten[i] = scanner.nextInt();

		}
		
		//set value of seiseki object 
		seiseki.setNo(no);
		seiseki.setName(name);
		seiseki.setKamoku(kamoku);
		seiseki.setTokuten(wTokuten);
		
		
		//data output 
		System.out.println("No : " + seiseki.getNo());
		System.out.println("Name : " + seiseki.getName());
		System.out.println("Kamoku : " + seiseki.getKamoku());
		System.out.print("Tokuten :  " );
		for(int i = 0; i < count; i++) {
			System.out.println(seiseki.getTokutenN(i) + "  ");
		}
		System.out.println();
		System.out.println("Average : " + seiseki.getAverage());
		System.out.println("Grade : " + seiseki.getGrade());
		
		System.out.println("Count (1 ~ " + count + ") -->");
		int outCount = scanner.nextInt();
		System.out.println("Test " + outCount + " -->");
		int updateScore = scanner.nextInt();
		seiseki.setTokutenN(outCount, updateScore);
		
		//data output 
		System.out.println("No : " + seiseki.getNo());
		System.out.println("Name : " + seiseki.getName());
		System.out.println("Kamoku : " + seiseki.getKamoku());
		System.out.print("Tokuten :  ");
		for(int i = 0; i < count; i++) {
			System.out.print(seiseki.getTokutenN(i) + "  ");
		}
		System.out.println();
		System.out.println("Average : " + seiseki.getAverage());
		System.out.println("Grade : " + seiseki.getGrade());
		
		
	}

}
