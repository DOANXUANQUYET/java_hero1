package kadai0305;

public class Seiseki {
	
	private String no;
	private String name;
	private String kamoku;
	private int[] tokuten;
	
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKamoku() {
		return kamoku;
	}
	public void setKamoku(String kamoku) {
		this.kamoku = kamoku;
	}
	public int[] getTokuten() {
		return tokuten;
	}
	public void setTokuten(int[] tokuten) {
		this.tokuten = tokuten;
	}
	
	public int getTokutenN(int i) {
		// tokuten[0] ~
		if(i < tokuten.length) {
			return tokuten[i];
		}
		else {
			return -1;
		}
	}
	
	public void setTokutenN(int i, int ten) {
		i--;
		if(i < tokuten.length) {
			tokuten[i] = ten;
		}
	}
	
	public double getAverage() {
		int sum = 0;
		for(int i = 0; i < tokuten.length; i++) {
			sum += tokuten[i];
		}
		
		return (double)sum / tokuten.length;
	}
	
	public String getGrade() {
		double avg = getAverage();
		if(avg >= 95.0) {
			return "秀";
		}
		else if(avg >= 85.0) {
			return "優";
		}
		else if(avg >= 70.0) {
			return "良";
		}
		else if(avg >= 60.0) {
			return "可";
		}
		else {
			return "不可";
		}
	}
	

}
