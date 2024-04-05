package staticex;

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println(10 * 10 * Calculator.pi); // 원의 둘레 구하기
		
		System.out.println(Calculator.plus(10, 5)); //  두 수의 합 구하기

		System.out.println(Calculator.minus(10, 5)); // 두 수의 차 구하기
	}

}

// 계산기 클래스
class Calculator {
	static double pi = 3.14159; // 원의 둘레를 구하는 파이는 공통속성
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}