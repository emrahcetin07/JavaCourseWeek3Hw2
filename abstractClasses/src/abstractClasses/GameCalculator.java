package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();//burd sadece fonk tanımı yapılır
	//bu abstract sınıfdankim inherite olurs onda bu fonksiyonu implemente etmen gerek
	public void gameOver() {
		System.out.println("Oyun bitti");
	}

}
