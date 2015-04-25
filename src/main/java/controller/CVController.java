package controller;

import model.CV;
import model.CVsManager;
import model.Personne;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by jaired on 16/04/15.
 */

@Controller
@RequestMapping("/descvs")
public class CVController {

    private ArrayList<CV> cvs;

    public CVController() {
        cvs=new ArrayList<CV>();
        //------------------------------------------
        CV unCV=new CV();
        unCV.setTitre("Mr");
        unCV.setIdentite(new Personne("002255447", "saint aignant","JAI","Reda"));
        this.cvs.add(unCV);

        CV unCV2=new CV();
        unCV2.setTitre("Mr");
        unCV2.setIdentite(new Personne("00112233", "leinden","armin ","van buuren"));
        this.cvs.add(unCV2);

        CV unCV3=new CV();
        unCV3.setTitre("Mr");
        unCV3.setIdentite(new Personne("44556677", "miami","markus ","schulz"));
        this.cvs.add(unCV3);


        CV unCV4=new CV();
        unCV4.setTitre("Mr");
        unCV4.setIdentite(new Personne("88990011", "worclaw","indecent","noise"));
        this.cvs.add(unCV4);

    }




    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody CV unCV(@PathVariable int id){




        return this.cvs.get(id);
    }



    @RequestMapping(value="", method = RequestMethod.GET)
    public @ResponseBody CVsManager desCV(){




        return new CVsManager(this.cvs);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody void insertCV(@RequestBody CV cv){
        //initArray();
        this.cvs.add(cv);

    }







}
