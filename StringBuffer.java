import java.util.ArrayList;
import java.util.Scanner;

public class StringBuffer {
	ArrayList<String> list = new ArrayList<String>();
	String sil;
	int eleman;

	StringBuffer(int eleman) {
		this.eleman = eleman;
		this.list = new ArrayList<String>(eleman);
	}

	public void guncelle(String str) {

		if (list.contains(str) || eleman <= list.size()) {
			if (list.contains(str)) {
				sil = str;
			} else {
				sil = list.get(eleman - 1);
			}	list.remove(sil);	}
		list.add(0, str);
	}

	public void yaz() {

		for (String string : list) {
			System.out.print(string + " ");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StringBuffer buff = new StringBuffer(5);

		System.out.println("En az 10 Kelimelik bir string giriniz: ");
		String cumle = input.nextLine();
		String[] dizi = cumle.split(" ");

		if (dizi.length >= 10) {
			for (int i = 0; i < dizi.length; i++) {
				buff.guncelle(dizi[i]);
				buff.yaz();
				System.out.println();

			}

		}

	}
}
// kelimeler: ben sen onlar bizler biz sen onlar onlar yok yok
// 5 elemanl� bir String buffer y�netimi yap�yoruz. Asl�nda LRU algoritmas� mant���n� kullan�yoruz. Buffera gelen tekrarl� veri di�renin �zerine yaz�l�r.
// E�er buffer boyutunu a�an say�da veri girilirse 5 elemanl�k bufferda yeni eleman, en eski eklenen eleman�n �zerine yaz�l�r