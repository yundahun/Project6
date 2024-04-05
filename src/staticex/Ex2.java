package staticex;

public class Ex2 {

	public static void main(String[] args) {

		Student2 student1 = new Student2();
		System.out.println(Student2.getCount());
		
		Student2 student2 = new Student2();
		System.out.println(Student2.getCount()); // 참조변수 사용해도 되지만 스태틱은 클래스 이름 사용
	}

}
//학생 클래스
class Student2 {
	
	static int count = 0; // 공통속성
	int studentID;
	String studentName;
	
	public static int getCount() {
		return count; // count = static 메소드도 자동으로 스태틱
	}
	
	// static 메소드 안에서는 static 변수와 지역변수만 사용 가능
	public static void setCount(int count) {
		Student2.count = count;
//		studentName = "둘리"; // 인스턴스 변수 사용 불가  why? 객체 < static 메소드 (먼저 만들어짐)
	}
	
	public Student2() {
		count++; // 학생이 생성될 때마다 증가
		studentID = count; // 증가된값을 학번에 부여
	}
}