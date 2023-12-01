package com.Banque.Banque;

public class ComptePayant {
	 private Long id;
	 private double solde;
	 
	 
	 
	 
	 public ComptePayant(Long id, double solde) {
		super();
		this.id = id;
		this.solde = solde;
	}
		public String toString(){
	        return " Solde: "+this.solde;
	}
		// méthode qui vérifie le solde
		   private boolean verifSolde(double solde) {
			   if (this.solde>=solde) {
				   return true;
			   }
			   return false;
		   }
	 
	public void retraitArgentPayant(double solde, ComptePayant comptePayant) {
			if(verifSolde(solde)) {
				this.solde-=solde;
			}else {
				System.out.println("Pas assez d'argent ! ");
			}
			
			System.out.println("Le solde de votre compte payant est de : "+getSolde());
		}
		//méthode qui permet le retrait d'argent
		public void ajoutArgentPayant(double solde, ComptePayant comptePayant) {
			System.out.println("Solde de départ : "+getSolde());
			System.out.println("Argent ajouter : "+solde+" €");
			this.solde+=solde;
			System.out.println("Le solde de votre compte Payant est de :"+getSolde());
			System.out.println("-----------------------------");
		}

		//méthode permettant d'ajouter un taux d'intérêt
		public void ajoutInteretPayant(ComptePayant comptePayant) {
			System.out.println("Solde avec intérêts : "+(getSolde()*0.06)+" €");
			this.solde*=1.06;
			System.out.println("Le solde de votre compte Payant est de :"+getSolde());
			System.out.println("-----------------------------");
		}




		public double getSolde() {
			return solde;
		}


		public void setSolde(double solde) {
			this.solde = solde;
		}
}
