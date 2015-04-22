package model;

import model.CV;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by jaired on 16/04/15.
 */

@XmlRootElement(name="listecv")
public class CVsManager {


    private ArrayList<CV> listCV;


    public CVsManager(ArrayList<CV> listCV) {

        this.listCV=new ArrayList<CV>();
        this.setListCV(listCV);
    }

    public CVsManager() {

        this.listCV=new ArrayList<CV>();

    }
    public ArrayList<CV> getListCV() {
        return listCV;
    }

    public void setListCV(ArrayList<CV> listCV) {
        this.listCV = listCV;
    }



}
