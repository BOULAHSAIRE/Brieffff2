package Brief2;

public class Employecommission extends Employefixe {
	

		    private double CommissionTarif;
		    private double ventestotal;

		    
		    
		      
		    public Employecommission( String Prenom, String Nom, int Date, int salaire, double CommissionTarif, double Ventestotal) {
		        super(Nom ,Prenom, Date, salaire );
		        
		        this.CommissionTarif = CommissionTarif;
		        this.ventestotal = Ventestotal;
		    }
		        
		       

			 public double calculerSalaire()
			    {
			        return  super.getsalaire()+(ventestotal * CommissionTarif);
			    }

		
			    @Override
			    public String toString() {        
			       return  super.toString() + 
			    		   String.format( "Salaire:", calculerSalaire());
			    }

		}

