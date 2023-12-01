package com.Banque.Banque;

public class CompteEpargne {
	
	 private Long id;
	 
	 private double tauxInteret;
	 
	 private double solde;
	 
	 
	 
	

	public CompteEpargne(double tauxInteret, double solde) {
		super();
		this.tauxInteret = tauxInteret;
		this.solde = solde;
	}

	public CompteEpargne(Long id, double tauxInteret, double solde) {
		super();
		this.id = id;
		this.tauxInteret = tauxInteret;
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

//méthode qui permet le retrait d'argent si le solde le permet

public void retraitArgentEpargne(double solde, CompteEpargne compteEpargne) {
	if(verifSolde(solde)) {
		this.solde-=solde;
	}else {
		System.out.println("Pas assez d'argent ! ");
	}
	
	System.out.println("Le solde de votre compte Epargne est de  : "+getSolde());
}
//méthode qui permet le retrait d'argent
public void ajoutArgentEpargne(double solde, CompteEpargne compteEpargne) {
	System.out.println("Solde de départ : "+getSolde());
	System.out.println("Argent ajouter : "+solde+" €");
	this.solde+=solde;
	System.out.println("Le solde de votre compte Epargne est de :"+getSolde());
	System.out.println("-----------------------------");
}

//méthode permettant d'ajouter un taux d'intérêt
public void ajoutInteretEpargne(CompteEpargne compteEpargne) {
	System.out.println("Solde avec intérêts : "+(getSolde()*0.06)+" €");
	this.solde*=1.06;
	System.out.println("Le solde de votre compte Epargne est de :"+getSolde());
	System.out.println("-----------------------------");
}




public double getSolde() {
	return solde;
}


public void setSolde(double solde) {
	this.solde = solde;
}

public double getTauxInteret() {
	return tauxInteret;
}

public void setTauxInteret(double tauxInteret) {
	this.tauxInteret = tauxInteret;
}


}

	
