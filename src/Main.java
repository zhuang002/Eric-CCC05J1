import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double planA = 0;
		double planB = 0;

		Scanner sc = new Scanner(System.in);
		int daytime = sc.nextInt();
		int evening = sc.nextInt();
		int weekend = sc.nextInt();

		int chargeDaytime = daytime - 100;
		if (chargeDaytime > 0) {
			planA += 0.25 * chargeDaytime;
		}
		planA += evening * 0.15 + weekend * 0.20;

		chargeDaytime = daytime - 250;
		if (chargeDaytime > 0) {
			planB += chargeDaytime * 0.45;
		}
		planB += evening * 0.35 + weekend * 0.25;

		System.out.printf("Plan A costs %.2f\n", planA);

		System.out.printf("Plan B costs %.2f\n", planB);

		if (planA < planB) {
			System.out.println("Plan A is cheapest.");
		} else if (planA > planB) {
			System.out.println("Plan B is cheapest.");
		} else {
			System.out.println("Plan A and B are the same price.");
		}

	}

}
