/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.L.P0022;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MEN'TRAINING
 */
public class CheckAndCommonTool {

    public CheckAndCommonTool() {
    }
//Birth Date : is number with length is 4 character (1900..Current Year)

    public boolean checkBirthDate(String s) {
        if (!checkInt(s)) {
            return false;
        }
        int x = Integer.parseInt(s);
        return 1900 <= x && x <= (new Date().getYear());
    }
//Phone: is number with minimum 10 characters

    public boolean checkPhone(String s) {
        return s.matches("[\\d]{10,15}");
    }
//Email: with format &lt;account name&gt;@&lt;domain&gt;. (eg: annguyen@fpt.edu.vn)

    public boolean checkEmail(String s) {
        return s.matches("[\\w\\W]+@[\\w\\W]+\\.[\\w\\W]+");
        // \w matches the word characters
    }
//check if input is not integer

    public boolean checkInt(String s) {
        try {
            int x = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
//Year of Experience : is number from 0 to 100

    public boolean checkYearOfExperience(String s) {
        if (!checkInt(s)) {
            return false;
        }
        int x = Integer.parseInt(s);
        return (0 <= x && x <= 100);
    }

//Rank of Graduation: with one of 4 values (Excellence, Good, Fair, Poor)
    //check
    public boolean checkRankOfGraduation(String s) {
        return ("1234".contains(s) && s.length() == 1);
    }

    //return
    public String returnRankOfGraduation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Rank of Graduation: ");
        System.out.println("1(Excellent), 2(Good), 3(Fair), 4(Poor)");
        String s = input.nextLine();
        while (!checkRankOfGraduation(s)) {
            System.out.println("Please enter rank of Graduation from 1 to 4: ");
            System.out.println("1(Excellent), 2(Good), 3(Fair), 4(Poor)");
            s = input.nextLine();
        }
        switch (Integer.parseInt(s)) {
            case 1:
                return "Excellent";
            case 2:
                return "Good";
            case 3:
                return "Fair";
            default:
                return "Poor";
        }
    }
//check ID duplication
    public boolean checkExistedCandidateID(ArrayList<Candidate> t, String candidateID) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getCandidateID().equalsIgnoreCase(candidateID)) {
                return true;
            }
        }
        return false;
    }
//return input ID isn't duplicate
    public String returnCandidateID(ArrayList<Candidate> t) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Candidate ID: ");
        String candidateID = input.nextLine();
        while (checkExistedCandidateID(t, candidateID)) {
            System.out.println("CandidateID existed! Please enter other Candidate ID: ");
            candidateID = input.nextLine();
        }
        return candidateID;
    }
// input only Candidate's property
    public Candidate inputCandidate(ArrayList<Candidate> t, int typeOfCandidate) {
        Scanner input = new Scanner(System.in);
        String candidateID = returnCandidateID(t);
        System.out.println("Enter Candidate Fisrt Name: ");
        String candidateFirstName = input.nextLine();
        System.out.println("Enter Candidate Last Name: ");
        String candidateLastName = input.nextLine();
        //checkBirthDate
        System.out.println("Enter birthDate Candidate: ");
        String birthDate = input.nextLine();
        while (!checkBirthDate(birthDate)) {
            System.out.println("Please enter birthDate Candidate again: ");
            birthDate = input.nextLine();
        }
        System.out.println("Enter address: ");
        String address = input.nextLine();
        //check phone
        System.out.println("Enter phone's Candidate: ");
        String phone = input.nextLine();
        while (!checkPhone(phone)) {
            System.out.println("Enter phone's Candidate again: ");
            phone = input.nextLine();
        }
        //check email
        System.out.println("Enter email's Candidate: ");
        String email = input.nextLine();
        while (!checkEmail(email)) {
            System.out.println("Enter email's Candidate again: ");
            email = input.nextLine();
        }
        Candidate c = new Candidate(candidateID, birthDate, phone, birthDate, address, phone, email, typeOfCandidate);
        return c;
    }

}
