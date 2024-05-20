import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int planA=0;
		int planB=0;
		
		Scanner sc = new Scanner(System.in);
		int daytime = sc.nextInt();
		int evening = sc.nextInt();
		int weekend = sc.nextInt();
		
		int chargeDaytime =daytime - 100;
		if (chargeDaytime>0) {
			planA+=25*chargeDaytime;
		}
		planA+=evening*15+weekend*20;
		
		chargeDaytime = daytime - 250;
		if (chargeDaytime>0) {
			planB+=chargeDaytime*45;
		}
		planB+=evening*35+weekend*25;
		
		int remainder = planA%100;
		String sRemainder = "";
		if (remainder>0) sRemainder += remainder;
		else sRemainder = "00";
		System.out.println("Plan A costs "+(planA/100)+"."+ sRemainder);
		
		
		remainder = planB%100;
		sRemainder = "";
		if (remainder>0) sRemainder += remainder;
		else sRemainder = "00";
		System.out.println("Plan B costs "+(planB/100)+"."+ sRemainder);
		
		if (planA<planB) {
			System.out.println("Plan A is cheapest.");
		} else if (planA>planB) {
			System.out.println("Plan B is cheapest.");
		} else {
			System.out.println("Plan A and B are the same price.");
		}
		
		
		

	}

}
