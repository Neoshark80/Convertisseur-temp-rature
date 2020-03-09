package Exception;

import java.util.Scanner;

public class convertisseurDegresFahrenheit {
	public static void main(String[] args) {
		convertisseur();
	}

	private static void convertisseur() {
		char retry = 'o', conversionSouhait� = 0;
		double temperatureAConvertir = 0, resultatEnFahrenheit = ((int) temperatureAConvertir * 1.8 + 32),
				resultatEnDegr�s = (((int) temperatureAConvertir - 32) / 1.8);
		Scanner sc = new Scanner(System.in);
		try {
			while (retry == 'o' || retry == 'O') {
				System.out
						.println("Choisissez votre convertion :\n 1_ Degr�s -> Fahrenheit \n 2_ Fahrenheit -> Degr�s");
				conversionSouhait� = sc.nextLine().charAt(0);
				if (conversionSouhait� == '1') {
					System.out.println("Temp�rature � convertir en Fahrenheit");
					temperatureAConvertir = sc.nextInt();
					System.out.println(resultatEnFahrenheit);
					sc.nextLine();
					System.out.println("Voulez vous re-essayer? (O/N)");
					retry = sc.nextLine().charAt(0);
				} else if (conversionSouhait� == '2') {
					System.out.println("Temp�rature � convertir en Celcius");
					temperatureAConvertir = sc.nextInt();
					System.out.println(resultatEnDegr�s);
					sc.nextLine();
					System.out.println("Voulez vous re-essayer? (O/N) ");
					retry = sc.nextLine().charAt(0);
				} else {
					System.out.println("Je ne comprend pas votre r�ponse");
					System.out.println("Voulez vous re-essayer? (0/N)");
					retry = sc.nextLine().charAt(0);
				}
			}
		}

		catch (NumberFormatException e) {
			System.out.println("All arguments should be provided as numbers");
			System.exit(-1);

		}
	}
}