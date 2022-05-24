package Brief2;

public class Employefixe extends Employe {


	    private int salaire;
	    
		
		public Employefixe(String Prenom , String Nom,int Date ,int salaire) {
			super(Prenom , Nom  ,Date, salaire );
			this.salaire =salaire;
		}


		@Override
		public double  calculerSalaire() {
			return salaire;
		}
		@Override
	    public String toString() {
	        return String.format("Employefixe :Prenom :"+ this.getPrenom ()+"\nNom:"+this.getNom()+"\nDate:"+this.getDate()+"\nsalaire  "+ calculerSalaire());
	    }
		
	}	    