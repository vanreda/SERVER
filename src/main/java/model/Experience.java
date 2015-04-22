package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by jaired on 16/04/15.
 */
@XmlRootElement(name="experience")
public class Experience {

    private String Description;
    private int Annee;


    public Experience() {
    }

    public Experience(String description, int annee) {
        Description = description;
        Annee = annee;
    }

    public String getDescription() {
        return Description;
    }
    @XmlElement
    public void setDescription(String description) {
        Description = description;
    }

    public int getDateExp() {
        return Annee;
    }
    @XmlElement
    public void setDateExp(int dateExp) {
        Annee = dateExp;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "Description='" + Description + '\'' +
                ", DateExp=" + Annee +
                '}';
    }
}
