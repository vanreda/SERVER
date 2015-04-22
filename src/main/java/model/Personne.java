package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jaired on 16/04/15.
 */

@XmlRootElement(name="identity")
public class Personne {
    private String Nom, Prenom, Adresse, Tel;


    public Personne() {
    }

    public Personne(String tel, String adresse, String prenom, String nom) {
        Tel = tel;
        Adresse = adresse;
        Prenom = prenom;
        Nom = nom;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getTel() {
        return Tel;
    }

    @XmlElement
    public void setNom(String nom) {
        Nom = nom;
    }

    @XmlElement
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }
    @XmlElement
    public void setAdresse(String adresse) {
        Adresse = adresse;
    }
    @XmlElement
    public void setTel(String tel) {
        Tel = tel;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", Tel='" + Tel + '\'' +
                '}';
    }
}
