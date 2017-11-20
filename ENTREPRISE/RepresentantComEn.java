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
public class RepresentantComEn  extends Employe {
     int chiffreAffaire;

    
     
    public RepresentantComEn (String NomE, String PrenomE, int DateE, String MatriculE, int AgeE,int nombre) {
        super(NomE, PrenomE, DateE, MatriculE, AgeE);
        
    }
    
     public String getTypeEmploye(){
      return " RepresantantComEn : ";
  }

    @Override
    public double calculSalaire() {
          double salaire = (chiffreAffaire*0.2)+110000.0+200.0;
          return salaire;
    }
    
}
    

