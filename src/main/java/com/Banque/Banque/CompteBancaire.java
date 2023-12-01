package com.Banque.Banque;


public class CompteBancaire {
    
    private Long id;
	
    private String nom;
 
    private String numeroIBAN;

    private double solde;
   
    public CompteBancaire(long id, String nom, String numeroIBAN, double solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.numeroIBAN = numeroIBAN;
		this.solde = solde;
	}


	// méthode qui vérifie le solde
   private boolean verifSolde(double solde) {
	   if (this.solde>=solde) {
		   return true;
	   }
	   return false;
   }
    
    
    public String toString(){
            return "Nom :  "+this.nom+" Solde: "+this.solde+ "Numéro IBAN : "+this.numeroIBAN;
    }
    
   //méthode qui permet le retrait d'argent si le solde le permet
    
    public void retraitArgent(double solde, CompteBancaire compteBancaire) {
    	if(verifSolde(solde)) {
    		this.solde-=solde;
    	}else {
    		System.out.println("Pas assez d'argent ! ");
    	}
    	
    	System.out.println("Le solde de votre compte est de  : "+getSolde());
    }
    //méthode qui permet le retrait d'argent
    public void ajoutArgent(double solde, CompteBancaire compteBancaire) {
    	System.out.println("Solde de départ : "+getSolde());
    	System.out.println("Argent ajouter : "+solde+" €");
    	this.solde+=solde;
    	System.out.println("Le nouveau solde de votre compte est de :"+getSolde());
    	System.out.println("-----------------------------");
    }
    
    //méthode permettant d'ajouter un taux d'intérêt
    public void ajoutInteret(CompteBancaire compteBancaire) {
    	System.out.println("Solde avec intérêts : "+(getSolde()*0.06)+" €");
    	this.solde*=1.06;
    	System.out.println("Votre nouveau solde est de :"+getSolde());
    	System.out.println("-----------------------------");
    }
    
    
 

	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}
	


}
