/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

/**
 *
 * @author pierre
 *///kngjht je t'aime maman
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        PersonnellesEn p=new PersonnellesEn();
        p.ajouterEmploye (new ProductionEn("bouba","zargou",1997,"13G577",12,25));
        p.ajouterEmploye (new ManutentionEm ("PIERRE","JEAN",1970,"13D57",27,70));
        p.ajouterEmploye (new VendeurComEn ("TANGER","VALERIE",1990,"13A477",13,244));
        p.ajouterEmploye (new ManutentionnaireEm("FOMONIER","VASNI",1899,"13B47",16,70));
        p.ajouterEmploye (new ProducteurEn("mongLO","ANDRE",1990,"13B487",19,70));
        p.ajouterEmploye(new RepresentantComEn("pro","LOuis",1987,"17B737",40,17)); 
        
        
        p.afficherSalaire();
        System.out.println("le salaire moyen est "+p.salaireMoyen()+" franc ");
    }
    }
    

