package millipiyango2019;

import java.util.Scanner;

public class Main {

	static String deger;
	static String kind;
	static numbers num;
	static boolean isOkay=false;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		num=new numbers();
		
		System.out.println("1-Tam Bilet\n2-Yarým Bilet\n3-Çeyrek Bilet\n\nBilet Türünüzü Seçiniz:");
		kind=input.next();
		
		if(!kind.equals("1") && !kind.equals("2") && !kind.equals("3")) {
			System.out.println("Bilet türü yanlýþ girildi");
			System.exit(0);
		}
		
		System.out.println("Bilet Numaranýzý Giriniz: ");
		deger=input.next();
		
		if(deger.length()==7) {
			checkValue(deger);
		}else {
			System.out.println("Bilet yanlýþ girildi");
			System.exit(0);
		}
	}
	
	public static void checkValue(String value) {
		
		String[] money = null;
		
		if(kind.equals("1")) {
			money=num.numberFull;
		}else if(kind.equals("2")) {
			money=num.numberHalf;
		}else if(kind.equals("3")) {
			money=num.numberQuarter;
		}
		
		String[] numbers1=num.number13;
		for(int i=0;i<numbers1.length;i++) {
			if(numbers1[i].equals(value)) {
				isOkay=true;
				result(money[12]);
				break;
			}
		}
		
		String[] numbers2=num.number12;
		for(int i=0;i<numbers2.length;i++) {
			if(numbers2[i].equals(value)) {
				isOkay=true;
				result(money[11]);
				break;
			}
		}
		
		String[] numbers3=num.number11;
		for(int i=0;i<numbers3.length;i++) {
			if(numbers3[i].equals(value)) {
				isOkay=true;
				result(money[10]);
				break;
			}
		}
		
		String[] numbers4=num.number10;
		for(int i=0;i<numbers4.length;i++) {
			if(numbers4[i].equals(value)) {
				isOkay=true;
				result(money[9]);
				break;
			}
		}
		
		String[] numbers5=num.number9;
		for(int i=0;i<numbers5.length;i++) {
			if(numbers5[i].equals(value)) {
				isOkay=true;
				result(money[8]);
				break;
			}
		}
		
		String[] numbers6=num.number8;
		for(int i=0;i<numbers6.length;i++) {
			if(numbers6[i].equals(value)) {
				isOkay=true;
				result(money[7]);
				break;
			}
		}
		
		String[] numbers7=num.number7;
		for(int i=0;i<numbers7.length;i++) {
			if(numbers7[i].equals(value)) {
				isOkay=true;
				result(money[6]);
				break;
			}
		}
		
		String[] numbers8=num.number6;
		for(int i=0;i<numbers8.length;i++) {
			if(numbers8[i].equals(value.substring(1))) {
				isOkay=true;
				result(money[5]);
				break;
			}
		}
		
		String[] numbers9=num.number5;
		for(int i=0;i<numbers9.length;i++) {
			if(numbers9[i].equals(value.substring(2))) {
				isOkay=true;
				result(money[4]);
				break;
			}
		}
		
		String[] numbers10=num.number4;
		for(int i=0;i<numbers10.length;i++) {
			if(numbers10[i].equals(value.substring(3))) {
				isOkay=true;
				result(money[3]);
				break;
			}
		}
		
		String[] numbers11=num.number3;
		for(int i=0;i<numbers11.length;i++) {
			if(numbers11[i].equals(value.substring(4))) {
				isOkay=true;
				result(money[2]);
				break;
			}
		}
		
		String[] numbers12=num.number2;
		for(int i=0;i<numbers12.length;i++) {
			if(numbers12[i].equals(value.substring(5))) {
				isOkay=true;
				result(money[1]);
				break;
			}
		}
		
		String[] numbers13=num.number1;
		for(int i=0;i<numbers13.length;i++) {
			if(numbers13[i].equals(value.substring(6))) {
				isOkay=true;
				result(money[0]);
				break;
			}
		}
		
		if(!isOkay) {
			result("-");
		}
		
	}
	
	public static void result(String prize) {
		if(prize.equals("-")) {
			System.out.println("Herhangi Bir Ödül Kazanamadýnýz.");
			System.exit(0);
		}else {
			System.out.println("Tebrikler "+prize+" TL Ödül Kazandýnýz.");
			System.exit(0);
		}
	}

}
