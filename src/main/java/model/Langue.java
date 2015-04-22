package model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by jaired on 16/04/15.
 */
@XmlRootElement(name="langue")
public class Langue {
    private String Nom;
    private int Niveau;

    public Langue(String nom, int niveau) {
        Nom = nom;
        Niveau = niveau;
    }

    public Langue() {
    }

    public String getNom() {
        return Nom;
    }
    @XmlElement
    public void setNom(String nom) {
        Nom = nom;
    }

    public int getNiveau() {
        return Niveau;
    }
    @XmlElement
    public void setNiveau(int niveau) {
        Niveau = niveau;
    }


    @Override
    public String toString() {
        return "Langue{" +
                "Nom='" + Nom + '\'' +
                ", Niveau=" + Niveau +
                '}';
    }

    /**
     * Created by jaired on 16/04/15.
     */

    @Controller
    @RequestMapping("/cv")
    public static class CVController {

        private CV unCV;


        public CVController() {
            CV cv=new CV();
            Personne per=new Personne("JAI","REDA", "mont st aignant","000000");
            ArrayList<Formation> formations=new ArrayList<Formation>();
            formations.add(new Formation("bac+2",2008));
            formations.add(new Formation("bac+3",2011));

            cv.setIdentite(per);
            cv.setCursus(formations);



        }

        @RequestMapping(value="{name}", method = RequestMethod.GET)
        public @ResponseBody
        CV getCVs(){
            return this.unCV;
        }

    }
}
