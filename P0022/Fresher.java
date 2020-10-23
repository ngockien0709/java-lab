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
public class Fresher extends Candidate {

    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String education, String candidateID, String firstName,
            String lastName, String birthDate, String address, String phone, String email, int typeOfCandidate) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, 1);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }
//
    public Fresher(Candidate c, String graduationDate, String graduationRank, String education, int typeOfCandidate) {
        super(c.getCandidateID(), c.getFirstName(), c.getLastName(), c.getBirthDate(), c.getDddress(), c.getPhone(), c.getEmail(), 1);
        this.education = education;
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public String getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.education + " | " + this.graduationDate + " | " + this.graduationRank;
    }

    
}
