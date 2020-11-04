/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J22_Candidate;

import static J22_Candidate.Validate.getInputLimit;
import java.util.ArrayList;
import java.util.Calendar;
import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 *
 * @author nguye
 */
public class Candidate {
    
    public String candidateID;
    public String firstName;
    public String lastName;
    public int birthDate;
    public String address;
    public String phone;
    public String email;
    public int typeOfCandidate;
    
    public Candidate() {
    }
    
    public Candidate(String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeOfCandidate) {
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
    
    public int getBirthDate() {
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
    
    public String getAddress() {
        return address;
    }
    
    public int getTypeOfCandidate() {
        return typeOfCandidate;
    }
    
    public void getInputCandidate(ArrayList<Candidate> ac,int type) {
        while (true) {
            System.out.print("enter CandidateID: ");
            candidateID = Validate.getInputString();
            if (Validate.checkExistedCandidateID(ac, candidateID)) {
                break;
            }
        }
        
        System.out.print("enter firstName: ");
        firstName = Validate.getInputString();
        
        System.out.println("enter lastName: ");
        lastName = Validate.getInputString();
        
        System.out.println("enter birthDate: ");
        birthDate = getInputLimit(1900, Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.println("enter address:");
        address = Validate.getInputString();
        
        while (true) {            
            System.out.println("enter phone: ");
            phone = Validate.checkPhone();  
            if(Validate.checkExistPhone(ac, phone)){
                break;
            }
        }
        
        while (true) {            
            System.out.println("enter mail: ");
            email = Validate.checkMail();
            if(Validate.checkExistEmail(ac, email)){
                break;
            }
        }

    }
    
    @Override
     public String toString() {
        return firstName + " " + lastName + " | " + birthDate + " | "
                + address + " | " + phone + " | " + email + " | " + typeOfCandidate;
    }
}
