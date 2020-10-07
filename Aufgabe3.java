import java.util.Scanner;
public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.out.println("Bustarif");
		
		int Eingabe;
		String Ausgabe = "";
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte geben sie eine ZAhl von 0 - 10 an");
		
		Eingabe = s.nextInt();
		
		switch(Eingabe) {
		case 0:Ausgabe ="null";
		break;
		case 1:Ausgabe = "eins";
		break;
		case 2:Ausgabe = "zwei";
		break;
		case 3:Ausgabe = "drei";
		break;
		case 4:Ausgabe = "vier";
		break;
		case 5:Ausgabe = "fünf";
		break;
		case 6:Ausgabe = "sechs";
		break;
		case 7:Ausgabe = "sieben";
		break;
		case 8:Ausgabe = "acht";
		break;
		case 9:Ausgabe = "neun";
		break;
		case 10:Ausgabe = "zehn";
		break;	
		}
		
		System.out.println("Eingabe: " + Eingabe); 
		System.out.println(""); // Leerzeile
		System.out.println("Ausgabe: " + Ausgabe); 
		
	}

}
