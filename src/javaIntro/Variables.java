package javaIntro;

public class Variables {

	public static void main(String[] args) {
		
		char yeniDegisken='e';
		String ad="Erdinç";
		int yas=25;
		double boy=1.80;
		String metin="Merhaba benim adým";
		String metin2="Yaþýndayým";
		
		System.out.println("Ýlk harf : "+yeniDegisken);
		System.out.println("Ad: "+ad);
		System.out.println("Yaþ: "+yas);
		System.out.println(metin+" "+ad+"."+yas+" "+metin2);
		
		int toplam =yas+5;
		System.out.println(toplam);
		System.out.println(++toplam);
		toplam+=5;
		System.out.println(toplam);
		
		
		

	}

}
