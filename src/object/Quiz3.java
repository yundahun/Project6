package object;

public class Quiz3 {

	public static void main(String[] args) {
		Guest guest1 = new Guest("다훈", 3000);
		Americano americano = new Americano();
		
		Guest guest2 = new Guest("택호", 20000);
		Latte latte = new Latte();
		
		guest1.takeAmericano(americano);
		guest2.takeLatte(latte);
		
		americano.showInfo();
		latte.showInfo();
		guest1.showInfo();
		guest2.showInfo();
	}

}

class Americano {
	
	int money;
	
	public void take(int money) {
		
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("아메리카노의 이윤은 " + money + "원 입니다.");
	}
}

class Latte {
	
	int money;
	
	public void take(int money) {
		
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("라떼의 이윤은 " + money + "원 입니다.");
	}
}
class Guest {
	
	String guestName; // 고객 이름
	
	int money; //

	public Guest(String guestName, int money) {
		super();
		this.guestName = guestName;
		this.money = money;
	}
	
	// 아메리카노 요금을 지불하는 메소드
	public void takeAmericano (Americano americano) {
		
		if (money < 4000) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		americano.take(4000);
		this.money = this.money - 4000;
	}
	// 라떼 요금을 지불하는 메소드
	public void takeLatte (Latte latte) {
		
		if (money < 4500) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		latte.take(4500);
		this.money = this.money - 4500;
	}
	
	public void showInfo() {
		
		System.out.println(guestName + "님의 남은 돈은 " + money + "입니다.");
	}
}