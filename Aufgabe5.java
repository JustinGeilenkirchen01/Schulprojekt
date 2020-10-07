import java.util.Scanner;
public class Aufgabe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
String Monate = "";
int Anzahl = 12; 
Scanner s = new Scanner (System.in);
System.out.println("Bitte geben sie eine Zahl von 1 - 12 ein");

Anzahl = s.nextInt();



switch(Anzahl) {// immer der Wert der überprüft wird
case 1:Monate = "Januar";  //  case (Wert auf den überprüft wird)
System.out.println("Monat: " + Monate );	
break;
case 2:Monate = "Februar";
System.out.println("Monat: " + Monate );	
break;
case 3:Monate = "März";
System.out.println("Monat: " + Monate );	
break;
case 4:Monate = "April";
System.out.println("Monat: " + Monate );	
break;
case 5:Monate = "Mai";
System.out.println("Monat: " + Monate );	
break;
case 6:Monate = "Juni";
System.out.println("Monat: " + Monate );	
break;
case 7:Monate = "Juli";
System.out.println("Monat: " + Monate );	
break;
case 8:Monate = "August";
System.out.println("Monat: " + Monate );	
break;		
case 9:Monate = "September";
System.out.println("Monat: " + Monate );	
break;		
case 10:Monate = "Oktober";
System.out.println("Monat: " + Monate );	
break;		
case 11:Monate = "November";
System.out.println("Monat: " + Monate );	
break;		
case 12:Monate = "Dezember";
System.out.println("Monat: " + Monate );	
break;

default: System.out.println("Diesen Monat gibt es leider nicht versuchen Sie es mit einem anderen. ");
}


		
		
		
		
		
		
	}

}
