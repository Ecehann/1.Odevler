package altısaatlikjava;

public class workshop {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 0;

		boolean varMi = sayiBul(sayilar, aranacak); 

		
		mesajVer(varMi, aranacak); // T/False , 9 
	}

	public static void mesajVer(boolean varMi, int aranacak) {
		String mesaj = "";
		if (varMi == true) {
			mesaj = "Sayı mevcuttur: " + aranacak;
			System.out.println(mesaj);
		} else {
			mesaj = "Sayı mevcut değildir: " + aranacak;
			System.out.println(mesaj);
		}
	}

	public static boolean sayiBul(int[] sayilar, int aranacak) {
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		return varMi;
	}
}
