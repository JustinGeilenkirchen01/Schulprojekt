import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println("Bestellung");
	
	
	double Versandkosten = 5.50;
	double Bestellwert ;
	
	double Preis;
	int Menge;
	
	Scanner s = new Scanner(System.in);// Scanner wird nur einmal initialisiert
	
	System.out.println("bitte geben Sie die gew�nschte Bestellmenge an");
	
	Menge = s.nextInt(); //beschreibt die Variable mit einer Scannermethode uns lie�t den n�chsten int Wert aus.
	
	
	System.out.println("Bitte geben Sie den Preis an"); //sysout (strg + Leertsate) automatisch ausf�llern
	
	
	Preis = s.nextDouble();
	
	Bestellwert = Menge*Preis;
	
	System.out.println("Bestellwert: "+ Bestellwert );
	
			
	
	if (Bestellwert<100) {
	Versandkosten = 5.50;
	}
	if (Bestellwert>=100 && Bestellwert<200) {
	Versandkosten = 3;
	}
	if (Bestellwert>=200) {
	Versandkosten = 0;
	}
	
	double Rechnungsbetrag = (Versandkosten + Bestellwert);
	System.out.println("Bestellwert: " + Bestellwert + "�" + " Versandkosten: " + Versandkosten + "� "  +  "Rechnungsbetrag: " + Rechnungsbetrag + "�");
	
	
		
		
	}

}
