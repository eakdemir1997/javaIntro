package javaIntro;

public class Variables {

	public static void main(String[] args) {
		
		char yeniDegisken='e';
		String ad="Erdin�";
		int yas=25;
		double boy=1.80;
		String metin="Merhaba benim ad�m";
		String metin2="Ya��nday�m";
		
		System.out.println("�lk harf : "+yeniDegisken);
		System.out.println("Ad: "+ad);
		System.out.println("Ya�: "+yas);
		System.out.println(metin+" "+ad+"."+yas+" "+metin2);
		
		int toplam =yas+5;
		System.out.println(toplam);
		System.out.println(++toplam);
		toplam+=5;
		System.out.println(toplam);
		
		
		

	}

}
