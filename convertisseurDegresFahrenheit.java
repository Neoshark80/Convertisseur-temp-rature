package Exception;

import java.util.Scanner;

public class convertisseurDegresFahrenheit {
	public static void main(String[] args) {
		convertisseur();
	}

	private static void convertisseur() {
		char retry = 'o', conversionSouhaité = 0;
		double temperatureAConvertir = 0, resultatEnFahrenheit = ((int) temperatureAConvertir * 1.8 + 32),
				resultatEnDegrés = (((int) temperatureAConvertir - 32) / 1.8);
		Scanner sc = new Scanner(System.in);
			while (retry == 'o' || retry == 'O') {
				System.out
						.println("Choisissez votre convertion :\n 1_ Degrés -> Fahrenheit \n 2_ Fahrenheit -> Degrés");
				conversionSouhaité = sc.nextLine().charAt(0);
				if (conversionSouhaité == '1') {
					System.out.println("Température à convertir en Fahrenheit");
					temperatureAConvertir = sc.nextInt();
					System.out.println(resultatEnFahrenheit);
					sc.nextLine();
					System.out.println("Voulez vous re-essayer? (O/N)");
					retry = sc.nextLine().charAt(0);
				} else if (conversionSouhaité == '2') {
					System.out.println("Température à convertir en Celcius");
					temperatureAConvertir = sc.nextInt();
					System.out.println(resultatEnDegrés);
					sc.nextLine();
					System.out.println("Voulez vous re-essayer? (O/N) ");
					retry = sc.nextLine().charAt(0);
				} else {
					System.out.println("Je ne comprend pas votre réponse");
					System.out.println("Voulez vous re-essayer? (0/N)");
					retry = sc.nextLine().charAt(0);
	
		}
	}
}
