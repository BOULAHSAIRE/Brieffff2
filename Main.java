package Brief2;
import java.util.Scanner;

public class Main {
			public static void main(String[] args) {
				
				Employefixe emp1 = new Employefixe("Alin","Tmame",23,4000);
				System.out.println(emp1.toString());
				// employe commission//
				 Employehoraire  emphor = new  Employehoraire ("Amal", "Nouri",30, 60, 0.5);
				 System.out.println(emphor.toString());
				//employee horaire//
				 Employecommission empCm = new Employecommission("Nawal", "Boulahsaire", 25, 5000, 0.5, 60);
				 System.out.println(empCm.toString());

	
	}
	
	
	
	

}