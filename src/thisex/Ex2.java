package thisex;

public class Ex2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setNaem("둘리");
		
		System.out.println(person);
		
		person.printThis(); // 위와 같은 값이 출력됨
	}
	
}

class Person {
	String name;
	
	// 이름을 변경하는 메소드
	public void setNaem(String name ) {
		this.name = name; // 멤버션수 = 지역변수
	}
	
	// this의 값을 출력하는 메소드
	public void printThis() {
		System.out.println(this);
	}
}