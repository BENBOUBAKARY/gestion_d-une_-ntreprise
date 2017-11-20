
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
public class ManutentionEm extends Employe{
int nombreHeure;

    public ManutentionEm(String NomE, String PrenomE, int DateE, String MatriculE, int AgeE,int nombre) {
        super(NomE, PrenomE, DateE, MatriculE, AgeE);
        nombreHeure = nombre ;
        
    }
    
    public String getTypeEmploye(){
      return " ManutentionE : ";
  }

    @Override
    public double calculSalaire() {
     return 110000.0+ nombreHeure *65.0;
    }


    
}
