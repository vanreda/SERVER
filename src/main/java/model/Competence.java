package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jaired on 16/04/15.
 */
@XmlRootElement(name="competence")
public class Competence {
    private String Titre;
    private String Description;

    public Competence(String titre, String description) {
        Titre = titre;
        Description = description;
    }

    public Competence() {
    }

    public String getTitre() {
        return Titre;
    }
    @XmlElement
    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getDescription() {
        return Description;
    }
    @XmlElement
    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Competence{" +
                "Titre='" + Titre + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
