package model;

import model.CV;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by jaired on 16/04/15.
 */

@XmlRootElement(name="listedeCVs")
public class CVsManager {

    @XmlElement(name="cv")
    private ArrayList<CV> cvs;


    public CVsManager(ArrayList<CV> cvs) {

        this.cvs=new ArrayList<CV>();
        this.setcvs(cvs);
    }

    public CVsManager() {

        this.cvs=new ArrayList<CV>();

    }
    public ArrayList<CV> getCVs() {
        return cvs;
    }

    public void setcvs(ArrayList<CV> cvs) {
        this.cvs = cvs;
    }



}
