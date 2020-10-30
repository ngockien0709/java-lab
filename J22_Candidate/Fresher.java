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
public class Fresher extends Candidate {

    private String graduationDate;
    private String graduationRank;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeOfCandidate) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, typeOfCandidate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    

    

    public String getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }


   

    
}
