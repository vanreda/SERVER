package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jaired on 16/04/15.
 */
@XmlRootElement(name="projet")
public class Projet {

    private String Sujet;
    private int Année;


    public Projet() {
    }

    public Projet(String sujet, int année) {
        Sujet = sujet;
        Année = année;
    }

    public int getAnnée() {
        return Année;
    }
    @XmlElement
    public void setAnnée(int année) {
        Année = année;
    }

    public String getSujet() {
        return Sujet;
    }
    @XmlElement
    public void setSujet(String sujet) {
        Sujet = sujet;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "Sujet='" + Sujet + '\'' +
                ", Année=" + Année +
                '}';
    }
}
