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
public class Internship extends Candidate {

    private String majors;
    private int semester;
    private String university;
    public Internship(String majors, int semester, String University, String candidateID, String firstName,
            String lastName, String birthDate, String address, String phone, String email, int typeOfCandidate) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, 2);
        this.majors = majors;
        this.semester = semester;
        this.university = University;
    }
//
    public Internship(Candidate c, String majors, int semester, String university, int typeOfCandidate) {
        super(c.getCandidateID(), c.getFirstName(), c.getLastName(), c.getBirthDate(), c.getDddress(), c.getPhone(), c.getEmail(), 2);
        this.university = university;
        this.majors = majors;
        this.semester = semester;
    }

    public String getMajors() {
        return majors;
    }

    public int getSemester() {
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
