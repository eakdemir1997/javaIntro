package javaIntro;

public class Loops {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------");
		
		for(int i=1; i<=20; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		int sayac=0;
		String ad="Erdinç";
		
		while(sayac<5) {
			System.out.println(ad+"-"+sayac);
			sayac++;			
		}
		
		int x=15;
		
		do {
			x+=5;
			System.out.println(x);
		}while(x !=35);
		
		
		System.out.println("- Ýç içe for döngüsü -");
		
		
		for(int i =0; i<5; i++) {
			for(int j=5; j>i; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
