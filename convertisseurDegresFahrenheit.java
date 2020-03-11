import java.util.InputMismatchException;
import java.util.Scanner;

public class convertisseurDegresFahrenheit {
	public static void main(String[] args) {
		convertisseur();
	}

	private static void convertisseur() {
		char retry = 'o', conversionSouhaité = 0;
		String temperatureEnString = new String();
		int temperatureAConvertirEnF = 0, temperatureAConvertirEnC = 0;
		Scanner sc = new Scanner(System.in);
		while (retry == 'o' || retry == 'O') {
			System.out.println("Choisissez votre convertion :\n 1_ Degrés -> Fahrenheit \n 2_ Fahrenheit -> Degrés");
			conversionSouhaité = sc.nextLine().charAt(0);
			if (conversionSouhaité == '1') {
				try {
					System.out.println("Température à convertir en Fahrenheit");
					temperatureEnString = sc.nextLine();
					temperatureAConvertirEnF = Integer.parseInt(temperatureEnString);
					double resultatEnFahrenheit = ((int) temperatureAConvertirEnF * 1.8 + 32);
					System.out.println(resultatEnFahrenheit);
				} catch (NumberFormatException e) {
					System.out.println("Veuillez entrer une valeur numérique\n");
				}
				System.out.println("Voulez vous re-essayer? (O/N)");
				retry = sc.nextLine().charAt(0);
			} else if (conversionSouhaité == '2') {
				try {
					System.out.println("Température à convertir en Celcius");
					temperatureEnString = sc.nextLine();
					temperatureAConvertirEnC = Integer.parseInt(temperatureEnString);
					double resultatEnDegrés = (temperatureAConvertirEnC - 32) / 1.8;
					System.out.println(resultatEnDegrés);
				} catch (NumberFormatException e) {
					System.out.println("Veuillez entrer une valeur numérique\n");
				}
				System.out.println("Voulez vous re-essayer? (O/N) ");
				retry = sc.nextLine().charAt(0);
			} else {
				System.out.println("Je ne comprend pas votre réponse\n");
				System.out.println("Voulez vous re-essayer? (0/N)");
				retry = sc.nextLine().charAt(0);
			}
		}
		while (retry == 'n' || retry == 'N') {
			System.out.println("Au revoir");
			break;
		}
	}
}