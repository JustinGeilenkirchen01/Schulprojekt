import java.util.Scanner;
public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Zahlenumwandlung");

double km = 0;
double Preis = 0.28;
double Preisab20  = 0.25;
double Preisab50  = 0.20;
double Ergebnis = 0;

Scanner s = new Scanner(System.in);

System.out.println("Bitte geben sie die gewünschte km Anzahl an");

km =s.nextDouble();
 
if (km<=20) {
Ergebnis = km * Preis;
}
if (km > 20 && km <= 50){
Ergebnis = (Preis * 20) + (Preisab20 *( km - 20));
	
}
if (km>50) {
Ergebnis = (Preis * 20) + (Preisab20 * 30) +  (Preisab50 *( km - 50 ));
}


System.out.println("");
System.out.println("Fahrpreis für "+ km + " Kilometer: "+Ergebnis+"€");



Ergebnis = 0;



//Andere Lösung
for (int x =1;x<=km;x++) {
Ergebnis = Ergebnis + Preis;
switch(x) {
case 20:Preis = 0.25;
break;
case 50:Preis = 0.20;
break;
case 100: Preis = 0.15;
break;
}
}
System.out.println("Fahrpreis für "+ km + " Kilometer: "+Ergebnis+"€");

 
	}

}
