package Brief2;

public abstract class Employe {

	    private String Nom;
	    private String Prenom;
	    private int Date;
	    private int  salaire;
	 
	    public Employe() {

	    }

	    public Employe(String Nom, String Prenom,int Date,int  salaire) {
	        this.salaire = salaire ;
	        this.Nom = Nom;
	        this.Prenom = Prenom ;
	        this.Date=Date;

	}
      //getters method//
		public double getsalaire() {
			return salaire ;
		}

		public void setsalaire(int salaire) {
			this.salaire = salaire ;
		}

		public String getNom() {
			return Nom;
		}
    //setters method//
		public void setNom(String nom) {
			Nom = nom;
		}

		public String getPrenom() {
			return Prenom;
		}

		public void setPrenom(String prenom) {
			Prenom = prenom;
		}
		
		public int getDate() {
			return Date;
		}

		public void setDate(int date) {
			Date = date;
		}
		

	 
	    public  abstract double  calculerSalaire() ;
	    @Override
	    public  String toString()  {     
	        return String.format( "nom :"+this.getNom() + "\nLe prenom" + this.getPrenom()+"\nLa date de naissance:"+ this.getDate());
		}

		
	    }

