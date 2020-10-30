/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J22_Candidate;

/**
 *
 * @author nguye
 */
public class Experience extends Candidate {

    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int expInYear, String proSkill, String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeOfCandidate) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, typeOfCandidate);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    
    

    public int getExpInYear() {
        return expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.expInYear + " | " + this.proSkill;
    }
}