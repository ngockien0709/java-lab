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
public class Candidate {

    private String candidateID;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String phone;
    private String email;
    private int typeOfCandidate;
    public Candidate() {
    }

    public Candidate(String candidateID, String firstName, String lastName, String birthDate, String address, String phone, String email, int typeOfCandidate) {
        this.candidateID = candidateID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.typeOfCandidate = typeOfCandidate;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return this.candidateID + " | " + this.firstName + " | " + this.lastName + " | " + this.birthDate 
                + " | " + this.address + " | " + this.phone + " | " + this.email + " | " + this.typeOfCandidate;
    }

    public String getAddress() {
        return address;
    }

    public int getTypeOfCandidate() {
        return typeOfCandidate;
    }
}
