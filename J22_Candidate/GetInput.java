/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J22_Candidate;

import static J22_Candidate.Validate.getInputLimit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class GetInput {

    static Scanner input = new Scanner(System.in);

    public static int menu() {
        System.out.println("1.Experience");
        System.out.println("2.Fresher");
        System.out.println("3.Internship");
        System.out.println("4.Searching");
        System.out.println("5.Exit");
        System.out.print("your choice?: ");
        int choice = Validate.getInputLimit(1, 5);
        return choice;
    }

    public static void getInputCandidate(ArrayList<Candidate> ac, int type) {
        System.out.print("enter CandidateID: ");
        String candidateID = Validate.getInputString();

        System.out.print("enter firstName: ");
        String firstName = Validate.getInputString();

        System.out.println("enter lastName: ");
        String lastName = Validate.getInputString();

        System.out.println("enter birthDate: ");
        int birthDate = getInputLimit(1900, Calendar.getInstance().get(Calendar.YEAR));

        System.out.println("enter address:");
        String address = Validate.getInputString();

        System.out.println("enter phone: ");
        String phone = Validate.checkPhone();

        System.out.println("enter mail: ");
        String mail = Validate.checkMail();

        Candidate candidate = new Candidate(candidateID, firstName, lastName, birthDate, address, phone, mail, type);
        if (Validate.checkExistedCandidateID(ac, candidateID)) {
            switch (type) {
                case 0:
                    creatExp(ac, candidate);
                    break;
                case 1:
                    createFresher(ac, candidate);
                    break;
                case 2:
                    createInternship(ac, candidate);
                    break;
            }
        } else {
            return;
        }
        System.out.println("do you  want more?");
        if (!Validate.checkUserChoose()) {
            return;
        }
    }

    public static void creatExp(ArrayList<Candidate> ac, Candidate candidate) {
        System.out.print("enter exp: ");
        int exp = Validate.checkInputOfEXP(candidate.getBirthDate());
        System.out.print("enter proskill: ");
        String proskill = Validate.getInputString();
        Experience experience = new Experience(exp, proskill, candidate.getCandidateID(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeOfCandidate());
        System.out.println("create success");
    }

    public static void createFresher(ArrayList<Candidate> ac, Candidate candidate) {
        System.out.println("enter graduationDate ");
        String graduationDate = Validate.getInputString();

        System.out.println("enter graduationRank: ");
        String graduationRank = Validate.getInputString();

        Fresher fresher = new Fresher(graduationDate, graduationRank,
                candidate.getCandidateID(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeOfCandidate());
        System.out.println("create success");
    }

    public static void createInternship(ArrayList<Candidate> ac, Candidate candidate) {
        System.out.println("enter majors: ");
        String majors = Validate.getInputString();

        System.out.println("enter semester");
        String semester = Validate.getInputString();

        System.out.println("enter university");
        String university = Validate.getInputString();

        Internship internship = new Internship(majors, semester, university,
                candidate.getCandidateID(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeOfCandidate());
        System.out.println("create success");
    }

    public static void searchCandidate(ArrayList<Candidate>ac){
        printListNameCandidate(ac);
        System.out.println("enter name");
        String name = Validate.getInputString();
        System.out.println("enter type : ");
        int type = Validate.getInputLimit(0, 2);
        for (Candidate c : ac) {
            if(c.getTypeOfCandidate()== type&&c.getLastName().contains(name)
                    ||c.getFirstName().contains(name)){
                System.out.println(c.toString());
            }
        }
    }
    
    
    public static void printListNameCandidate(ArrayList<Candidate> ac) {
        System.out.println("Experience Candidate");
        for (Candidate candidate : ac) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("Fresher Candidate");
        for (Candidate candidate : ac) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("Internship Candidate");
        for (Candidate candidate : ac) {
            if (candidate instanceof Internship) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }
}
