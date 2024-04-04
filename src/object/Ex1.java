package object;

public class Ex1 {

	public static void main(String[] args) {
		
		Student student = new Student("다훈", 10000); // 만원을 가진 다훈 학생
		
		Bus bus = new Bus(100); // 100번 버스를 만든다
		
		student.takeBus(bus); // 다훈 학생이 100번 버스에 탄다
		
		student.showInfo(); // 이후의 학생의 정보를 확인한다.
		
		bus.showInfo(); // 이후의 버스의 정보를 확인한다.
	}
}

// 버스 클래스
class Bus {
	int busNumber; // 버스번호
	int passengerCount; // 승객수
	int money; // 수입
	
	// 버스번호를 초기화하는 생성자를 만들어 주세요~
	public Bus(int busNumber) {
		super();
		this.busNumber = busNumber;
	}
	
	// 버스에 승객을 태우는 메소드
	public void take(int money) {
		
		this.money += money; // 버스 수입 증가 (누적)
		
		passengerCount++; //  승객수 1명 증가
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 "+ money + "입니다.");
	}
}
	
	// 지하철 클래스
class Subway {
	
	String lineNumber; // 지하철 노선번호
	
	int passengerCount; // 승객수
	
	int money; // 수입

	// 지하철 노선번호를 초기화하는 생성자를 만들어주세요~
	public Subway(String lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		
		this.money = this.money + money;
		
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}

// 학생클래스
class Student {
	
	String studentName; // 학생 이름
	
	int money; // 소지금

	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	// 버스에 타서 요금 1000원을 지불하는 메소드
	public void takeBus(Bus bus) {
		
		bus.take(1000); // 1000원 지불
		this.money = this.money - 1000; // 가진돈 1000원을 잃음
	}
	
	// 지하철에 타서 요금을 지불하는 메소드
	public void takeSubway(Subway subway) {
		
		subway.take(1500); // 1500원 지불
		this.money = this.money - 1500; // 가진돈 1500원을 잃음
	}
	
	public void showInfo() {
		
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
 }

