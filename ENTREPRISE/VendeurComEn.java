/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

/**
 *
 * @author pierre
 */
public class VendeurComEn  extends Employe {
       int chiffreAffaire;
       
    public VendeurComEn(String NomE, String PrenomE, int DateE, String MatriculE, int AgeE,int CA) {
        super(NomE, PrenomE, DateE, MatriculE, AgeE);
        chiffreAffaire=CA;
    }
    
     public String getTypeEmploye(){
      return " VendeurComEn : ";
  }

    @Override
    public double calculSalaire() {
        double salaire = (chiffreAffaire * 0.2) +110000.0+100.0;
        return salaire;
    }
    
}

    

