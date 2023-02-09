/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetjouet;

/**
 *
 * @author User
 */
public class Jouet {

        private String matiere;
        private int categorie;
        private int prix;
        private String nom;
        public Jouet (String unNom, String uneMatiere, int unPrix, int uneCategorie)
        {
            this.nom = unNom;
            this.prix = unPrix;
            this.matiere = uneMatiere;
            this.categorie = uneCategorie;
            
        }
        
        public void setNom (String unNom){
            this.nom = unNom;
        }
        public String getNom(){
            return this.nom;
        }
        public void setPrix (int unPrix){
            this.prix = unPrix;
        }
        public int getPrix(){
            return this.prix;
        }
        public void setMatiere(String uneMatiere){
            this.matiere = uneMatiere;
        }
        public String getMatiere()
        {
            return this.matiere;
        }
        public void setCategorie(int uneCategorie){
            this.categorie = uneCategorie;
        }
        public int getCategorie(){
            return this.categorie;
        }
        public String getPublic()
        {
            if(this.categorie == 1)
            {
                return "bebe";
            }
            if(this.categorie == 2)
            {
            return "enfant";
            }
            if(this.categorie == 3){
            return "ado";
            }
            else{
            return "adulte";
            }
        }
}
