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
public class Internship extends Candidate {

    private String majors;
    private String semester;
    private String university;

    public Internship() {
    }

    public Internship(String majors, String semester, String university, String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeOfCandidate) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, typeOfCandidate);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    
    
    
    
    

    public String getMajors() {
        return majors;
    }

    public String getSemester() {
        return semester;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.majors + " | " + this.university + " | " + this.semester;
    }

}
