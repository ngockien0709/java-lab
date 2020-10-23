/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.L.P0022;

/**
 *
 * @author MEN'TRAINING
 */
public class Experience extends Candidate {

    private int expInYear;
    private String proSkill;

    public Experience() {
    }
    public Experience(int expInYear, String proSkill, String candidateID, String firstName,
            String lastName, String birthDate, String address, String phone, String email, int typeOfCandidate) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, 0);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
//
    public Experience(Candidate c, int expInYear, String proSkill, int typeOfCandidate) {
        super(c.getCandidateID(), c.getFirstName(), c.getLastName(), c.getBirthDate(), c.getDddress(), c.getPhone(), c.getEmail(), 0);
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
