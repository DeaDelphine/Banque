package com.Banque.Banque;

public class Banque {
	
    public static void main(String args[]) {
        CompteBancaire C1= new CompteBancaire(1,"Hermione Granger", "BE12345678901234", 2000.00);
        System.out.println("Le solde de votre compte est de :"+C1.getSolde());
        C1.retraitArgent(200, C1);
        C1.ajoutArgent(1000, C1);
        C1.ajoutInteret(C1);
        
        CompteEpargne C2= new CompteEpargne((long) 2, 0.06, 20000.00);
        System.out.println(C2.getSolde());
        C2.retraitArgentEpargne(150, C2);
        C2.ajoutArgentEpargne(300, C2);
        C2.ajoutInteretEpargne(C2);
        
        ComptePayant C3= new ComptePayant((long) 2,  5000.00);
        System.out.println("Le solde de votre compte payant est de :"+C3.getSolde());
        C3.retraitArgentPayant(3000, C3);
        C3.ajoutArgentPayant(10000, C3);
        C3.ajoutInteretPayant(C3);
             
        
}


}
