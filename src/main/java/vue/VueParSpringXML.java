package vue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import metier.ICandidatMetier;

public class VueParSpringXML {
    public static void main(String[] args) {
        /*
         * Injection de dépendance avec Spring (Configuration XML)
         */
        // Lire le fichier de configuration
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");

        // récupérer un bean de type "ICandidatMetier" en spécifiant son id "metier"
        ICandidatMetier metier = (ICandidatMetier) springContext.getBean("metier");

        // Appeler la méthode isSucces()
        boolean res = metier.isSucces();
        if (res)
            System.out.println("Candidat réussi");
        else
            System.out.println("Candidat non réussi");
    }
}
