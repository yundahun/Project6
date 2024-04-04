package thisex;

public class Ex1 {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		
		bDay.setYear(2000);
		
		System.out.println(bDay);
		
		bDay.printThis();
	}
}

class BirthDay {
	int year;
	
	public void setYear(int year) {
		this.year =year; // 하늘색은 전역변수 파란색은 지역변수
	}
	
	public void printThis() {
		System.out.println(this);
	}
}