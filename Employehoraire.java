package Brief2;

public class Employehoraire extends Employe {

	public Employehoraire(String Prenom, String Nom, int Date, int salaire) {
		super (Prenom, Nom, Date, salaire);
	}

		    
		   private int Heurstrav;
		    private double HeursTarif;
		   
		    public Employehoraire(String Prenom, String Nom, int Date,int Heurstrav,  double HeursTarif  ) {
		        super(Prenom, Nom, Date, Heurstrav);
		        this. Heurstrav  = Heurstrav;
		        this. HeursTarif = HeursTarif;
		    }
		    
		    @Override
		    public double calculerSalaire() {
			

		    	if (Heurstrav<=100 && HeursTarif > 10) {
		    		return Heurstrav*HeursTarif; 
		    		} 
		    	else {
		    			return getsalaire();
		    		}
		    }
		    
		    @Override
		    public String toString() {        
		       return  super.toString() + 
		       String.format("Salaire:", calculerSalaire());
		    }
		}
				

