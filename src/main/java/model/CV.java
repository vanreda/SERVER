package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by jaired on 16/04/15.
 */


@XmlRootElement(name="cv")
public class CV {
    private String Titre;
    private Personne Identite;
    private ArrayList<Formation> Cursus;
    private ArrayList<Experience> ExperiencesPro;
    private ArrayList<Competence> Competences;
    private ArrayList<Langue> Langues;
    private ArrayList<Loisir> Loisirs;


    public CV(String titre, Personne identite) {
        Titre = titre;
        Identite = identite;
        this.Cursus=new ArrayList<Formation>();
        this.ExperiencesPro=new ArrayList<Experience>();
        this.Competences=new ArrayList<Competence>();
        this.Langues=new ArrayList<Langue>();
        this.Loisirs=new ArrayList<Loisir>();

    }
    public CV(String titre, String nom, String prenom, String tel, String adresse) {
        Titre = titre;
        Identite.setNom(nom);
        Identite.setPrenom(prenom);
        Identite.setAdresse(adresse);
        Identite.setTel(tel);
        this.Cursus=new ArrayList<Formation>();
        this.ExperiencesPro=new ArrayList<Experience>();
        this.Competences=new ArrayList<Competence>();
        this.Langues=new ArrayList<Langue>();
        this.Loisirs=new ArrayList<Loisir>();

    }



    public CV(){

    }
    public String getTitre() {
        return Titre;
    }


    public void setTitre(String titre) {
        Titre = titre;
    }

    public Personne getIdentite() {
        return Identite;
    }
    @XmlElement
    public void setIdentite(Personne identite) {
        Identite = identite;
    }

    public ArrayList<Formation> getCursus() {
        return Cursus;
    }
    @XmlElement
    public void setCursus(ArrayList<Formation> cursus) {
        Cursus = cursus;
    }

    public ArrayList<Experience> getExperiencesPro() {
        return ExperiencesPro;
    }
    @XmlElement
    public void setExperiencesPro(ArrayList<Experience> experiencesPro) {
        ExperiencesPro = experiencesPro;
    }

    public ArrayList<Competence> getCompetences() {
        return Competences;
    }
    @XmlElement

    public void setCompetences(ArrayList<Competence> competences) {
        Competences = competences;
    }

    public ArrayList<Langue> getLangues() {
        return Langues;
    }
    @XmlElement

    public void setLangues(ArrayList<Langue> langues) {
        Langues = langues;
    }

    public ArrayList<Loisir> getLoisirs() {
        return Loisirs;
    }
    @XmlElement

    public void setLoisirs(ArrayList<Loisir> loisirs) {
        Loisirs = loisirs;
    }



}
