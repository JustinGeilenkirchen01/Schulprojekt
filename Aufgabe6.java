import java.util.Scanner;
public class Aufgabe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.out.println("Kindergeld");

		
	int Einkommen =0;
	int Anzahlderkinder = -1;
	int Kindergeld = 0;
	
Scanner s = new Scanner (System.in);



System.out.println("Bitte geben sie Ihr Jahreseinkommen an");

Einkommen = s.nextInt();




while(Anzahlderkinder<0) {
System.out.println("");
System.out.println("Bitte geben Sie die Anzahl Ihrer Kinder an");
Anzahlderkinder = s.nextInt();




}


if (Einkommen<45000) {
switch(Anzahlderkinder) {


case 0: Kindergeld = 0;
break;
case 1: Kindergeld = 70;
break;
case 2: Kindergeld = (70+130);
break;
case 3: Kindergeld = (70+130+220);
break;
default: Kindergeld = (70+130+220+(240*(Anzahlderkinder- 3))); 

	}
}
if (Einkommen >=45000) {
switch(Anzahlderkinder) {

case 0: Kindergeld = 0;
break;
case 1: Kindergeld = 70;
break;
case 2: Kindergeld = (70+70);
break;
case 3: Kindergeld = (70+70+140);
break;
default: Kindergeld = (70+70+140+(140*(Anzahlderkinder- 3)));
}
}
System.out.println("Ergebnis:                "+ Kindergeld+"€ Kindergeld");


	



		
	}

}
