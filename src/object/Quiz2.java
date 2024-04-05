package object;

public class Quiz2 {

	public static void main(String[] args) {
		
		Student student3 = new Student("둘리", 5000);
		Taxi taxi = new Taxi();
		student3.takeTaxi(taxi);
		student3.showInfo();
		taxi.showInfo();
		
	}

}

class Taxi {
	int passengerCount;
	int money;
	
	public void take(int money) {
		
		this.money += money;
		
		passengerCount++;
	}
	
	public void showInfo () {
		System.out.println("택시의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
	
}
