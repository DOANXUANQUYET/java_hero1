package kadai0304;

public class Bonus {
	private String number;
	private int pay;
	private int rank;
	private int paiedLeave;
	private int absence;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getPaiedLeave() {
		return paiedLeave;
	}
	public void setPaiedLeave(int paiedLeave) {
		this.paiedLeave = paiedLeave;
	}
	public int getAbsence() {
		return absence;
	}
	public void setAbsence(int absence) {
		this.absence = absence;
	}
	
	private double getAccessRate() {
		switch (rank) {
		case 0:
			return 1.30;
		case 1:
			return 1.05;
		case 2:
			return 1.00;
		case 3:
			return 0.95;

		default:
			return 0.80;
		}
	}
	
	private double getAbsenceRate() {
		double lev = paiedLeave - absence;
		if(lev >= 0) {
			return 0;
		}
		else {
			lev *= -1;
			return (double)lev / 20;
		}
	}
	
	public int getBonus() {
		return (int)Math.round((pay * getAccessRate() - pay * getAbsenceRate()));
	}
}
