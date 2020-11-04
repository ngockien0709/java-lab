/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J22_Candidate;

import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class CreateCandidate {
    public static void createCandidateWithType(int type,ArrayList<Candidate>ac,Candidate candi){
         while (true) {
            //check value of type is equal 0
            switch (type) {
                //check value of type is equal 1
                case 0:
                    Experience exper = new Experience();
                    exper.creatExp(ac,candi);
                    ac.add(exper);
                    break;
                case 1:
                    Fresher fresh = new Fresher();
                    fresh.createFresher(ac,candi);
                    ac.add(fresh);
                    break;
                case 2:
                    Internship intern = new Internship();
                    intern.createInternship(ac, candi);
                    ac.add(intern);
                    break;
            }
            String choose = Validate.getInputString().trim();
            if(!Validate.checkUserChoose()){
                break;
            }
        }
    }
}
