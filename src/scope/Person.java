package scope;

// 모든 변수의 유효 범위를 작성하세요!
public class Person {
	
	//인스턴스 / 클래스
	// 지역변수 / 전역변수
	
	
	// 인스턴스 변수라서 객체 생성 후에 사용가능
	// 전역변수라서 클래스 끝나기 전까지 사용가능
	String personName;
	int personAge;
	
	
	// 클래스 변수라서 객체 없이도 사용가능
	// 전역변수라서 클래스 끝나기 전까지 사용가능
	static char gender = 'F';
	
	public void setPersonName(String name) { // 지역 변수는 메소드 안에서만 사용가능
		this.personName = name;
	}
}
