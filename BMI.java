import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner s = new Scanner(System.in);	

 double BMI = 0;
 String Kategorie = "";
 double Gewicht = 0;
 double Gr��e = 0;
 int Kalorienvorgabe = 0;
 
 
 
 
 System.out.println("Bitte geben sie ihre K�rpergr��e an");
 Gr��e = s.nextDouble();
 
 System.out.println("Bitte geben sie ihr K�rpergewicht an");
 Gewicht = s.nextDouble();
 
 
 BMI = Gewicht / (Gr��e * Gr��e);
 
 
 
 
 
if(BMI< 18.5) {
Kategorie = "Es herrscht Untergewischt";
Kalorienvorgabe =3000;
}
if(BMI>= 18.5 && BMI<25) {
Kategorie = "Es besteht Normalgewicht";
Kalorienvorgabe = 2000;
}
if(BMI >= 25 && BMI < 30) {
Kategorie = "Es besteht leichtes �bergewicht";
Kalorienvorgabe = 1800;
}
if(BMI >= 30 && BMI < 40) {
Kategorie = "Es besteht starkes �bergewicht";
Kalorienvorgabe = 1200;
}
if(BMI >= 40) {
Kategorie = "Es besteht extremes �bergewicht ";
Kalorienvorgabe = 700;
}
		
System.out.println("BMI: " + String.format("%1.1f",BMI ) + " " + Kategorie + " " + "Kalorienvorgabe: " + Kalorienvorgabe );		
		
	}

}
