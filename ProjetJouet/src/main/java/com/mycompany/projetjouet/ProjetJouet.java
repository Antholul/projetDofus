/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetjouet;

/**
 *
 * @author User
 */
public class ProjetJouet {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int a = 10;
        Jouet barbie = new Jouet("PoupeeBarbie", "Plastic", 15, 2);
        Jouet echec = new Jouet ("ÉchecLumineux", "verre", 45, 4);
        
       
        
        System.out.println("Nom : "+barbie.getNom()+ ", Prix : " +barbie.getPrix()+ ", Matiere : " +barbie.getMatiere()+ ", Categorie : " +barbie.getCategorie());
        System.out.println("Nom: "+echec.getNom()+ ", Prix : "  +echec.getPrix()+ ", Matiere : " +echec.getMatiere()+ ", Categorie : " +echec.getCategorie());
    }
}
