import java.util.InputMismatchException;
import java.util.Scanner;

public class convertisseurDegresFahrenheit {
	public static void main(String[] args) {
		convertisseur();
	}

	private static void convertisseur() {
		char retry = 'o', conversionSouhait� = 0;
		String temperatureEnString = new String();
		int temperatureAConvertirEnF = 0, temperatureAConvertirEnC = 0;
		Scanner sc = new Scanner(System.in);
		while (retry == 'o' || retry == 'O') {
			System.out.println("Choisissez votre convertion :\n 1_ Degr�s -> Fahrenheit \n 2_ Fahrenheit -> Degr�s");
			conversionSouhait� = sc.nextLine().charAt(0);
			if (conversionSouhait� == '1') {
				try {
					System.out.println("Temp�rature � convertir en Fahrenheit");
					temperatureEnString = sc.nextLine();
					temperatureAConvertirEnF = Integer.parseInt(temperatureEnString);
					double resultatEnFahrenheit = ((int) temperatureAConvertirEnF * 1.8 + 32);
					System.out.println(resultatEnFahrenheit);
				} catch (NumberFormatException e) {
					System.out.println("Veuillez entrer une valeur num�rique\n");
				}
				System.out.println("Voulez vous re-essayer? (O/N)");
				retry = sc.nextLine().charAt(0);
			} else if (conversionSouhait� == '2') {
				try {
					System.out.println("Temp�rature � convertir en Celcius");
					temperatureEnString = sc.nextLine();
					temperatureAConvertirEnC = Integer.parseInt(temperatureEnString);
					double resultatEnDegr�s = (temperatureAConvertirEnC - 32) / 1.8;
					System.out.println(resultatEnDegr�s);
				} catch (NumberFormatException e) {
					System.out.println("Veuillez entrer une valeur num�rique\n");
				}
				System.out.println("Voulez vous re-essayer? (O/N) ");
				retry = sc.nextLine().charAt(0);
			} else {
				System.out.println("Je ne comprend pas votre r�ponse\n");
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