package staticex;

public class Quiz1 {

	public static void main(String[] args) {
		Card card1 = new Card();
		card1.cardName = "농협";
		System.out.println(card1.cardName + " 카드번호 :" + card1.cardNumber);
		
		Card card2 = new Card();
		card2.cardName = "신한";
		System.out.println(card2.cardName + " 카드번호 :" + card2.cardNumber);
		
		Card card3 = new Card();
		card3.cardName = "국민";
		System.out.println(card3.cardName + " 카드번호 :" + card3.cardNumber);
		
		System.out.println(Card.serialNum);
	}

}

class Card {
	static int serialNum = 100;
	int cardNumber;
	String cardName;
	
	public Card() {
		cardNumber = serialNum;
		serialNum++;
	}
}