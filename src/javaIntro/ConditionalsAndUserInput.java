package javaIntro;

import java.util.Scanner;

public class ConditionalsAndUserInput {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Merhaba.Ad�n�z� ��renebilir miyim?");
		
		String ad;
		ad=scanner.nextLine();
		System.out.println("Tan��t���m�za memnun oldum "+ad);
		
		System.out.println("Ya��n�z?");
		int yas=scanner.nextInt();
		int sansliSayi;
		int harfSayisi=ad.length();
		
		if(yas<15) {
			sansliSayi=(harfSayisi*yas)%10;
		}
		else if(yas<20) {
			sansliSayi=(yas*yas-harfSayisi)%10;
		}
		else if(yas<40) {
			sansliSayi=(harfSayisi*yas-3)%10;
		}
		else if(yas<60) {
			sansliSayi=(harfSayisi*yas)%10;
		}
		else {
			sansliSayi=(yas*yas-harfSayisi)%10;
		}
		
		if(sansliSayi<0) 
			sansliSayi=sansliSayi*(-1);
		
		
		System.out.println("�ansl� say�n�z = "+sansliSayi);

	}

}
