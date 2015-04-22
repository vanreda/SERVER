package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jaired on 16/04/15.
 */
@XmlRootElement(name="loisir")
public class Loisir {
    private String Loisir;

    public Loisir() {
    }

    public Loisir(String loisir) {
        Loisir = loisir;
    }

    public String getLoisir() {
        return Loisir;
    }
    @XmlElement
    public void setLoisir(String loisir) {
        Loisir = loisir;
    }


    @Override
    public String toString() {
        return "Loisir{" +
                "Loisir='" + Loisir + '\'' +
                '}';
    }
}
