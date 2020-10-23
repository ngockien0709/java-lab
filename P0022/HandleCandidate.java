/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.L.P0022;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MEN'TRAINING
 */
public class HandleCandidate {

    public HandleCandidate() {
    }
//input information for Experience Candidate

    public Experience inputExperienceCandidate(ArrayList<Candidate> a) {
        CheckAndCommonTool t = new CheckAndCommonTool();
        Scanner input = new Scanner(System.in);
        Candidate c = t.inputCandidate(a, 0);
        //check expInYear
        System.out.println("Enter years of Experience: ");
        String expInYear = input.nextLine();
        while (!t.checkYearOfExperience(expInYear)) {
            System.out.println("Enter years of Experience again: ");
            expInYear = input.nextLine();
        }
        System.out.println("Enter proSkill of Candidate: ");
        String proSkill = input.nextLine();
        Experience e = new Experience(c, Integer.parseInt(expInYear), proSkill, 0);
        return e;
    }
//input information for Fresher Candidate

    public Fresher inputFresherCandidate(ArrayList<Candidate> a) {
        CheckAndCommonTool t = new CheckAndCommonTool();
        Scanner input = new Scanner(System.in);
        Candidate c = t.inputCandidate(a, 1);
        //check graduationDate
        System.out.println("Enter graduation date: ");
        String graduationDate = input.nextLine();
        while (!t.checkBirthDate(graduationDate)) {
            System.out.println("Enter graduation date again: ");
            graduationDate = input.nextLine();
        }
        String graduationRank = t.returnRankOfGraduation();
        // Education mean : university where student graduated
        System.out.println("Enter education's Candidate: ");
        String education = input.nextLine();
        Fresher f = new Fresher(c, graduationDate, graduationRank, education, 1);
        return f;
    }

//input information for Internship Candidate
    public Internship inputInternCandidate(ArrayList<Candidate> a) {
        CheckAndCommonTool t = new CheckAndCommonTool();
        Scanner input = new Scanner(System.in);
        Candidate c = t.inputCandidate(a, 2);
        System.out.println("Enter Candidate's major: ");
        String major = input.nextLine();
        System.out.println("Enter Candidate's semeter: ");
        int semeter = Integer.parseInt(input.nextLine());
        System.out.println("Enter Candidate's university's name: ");
        String university = input.nextLine();
        Internship i = new Internship(c, major, semeter, university, 2);
        return i;
    }
//search Candidate by Name of all list

    public ArrayList<Candidate> searchCandidateByName(String key, ArrayList<Candidate> list) {
        ArrayList<Candidate> e = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {//firstName and lastName contain searchKey
            if ((list.get(i).getFirstName() + " " + list.get(i).getLastName()).toLowerCase().contains(key.toLowerCase())) {
                e.add(list.get(i));
            }
        }
        return e;
    }
//search Candidate by ID

    public Candidate searchByID(ArrayList<Candidate> list, String ID) {
        return list.get(searchByIDreturnPos(list, ID));
    }
//search Candidate by ID and return it's position in list

    public int searchByIDreturnPos(ArrayList<Candidate> list, String ID) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCandidateID().equalsIgnoreCase(ID)) {
                return i;
            }
        }
        return -1;
    }
//display any list Candidate

    public void displayListCandidateByType(ArrayList<Candidate> list, int typeOfCandidate) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTypeOfCandidate() == typeOfCandidate) {
                System.out.println(list.get(i).toString());
            }
        }
    }
//return properties of types of Candidate

    public String returnProperty(int x) {
        String s = "candidateID | fisrtName | lastName | birhtDate | address | phone | email | typeOfCandidate";
        switch (x) {
            case 0:
                s += " | expInYear | proSkill";
            case 1:
                s += " | education | graduationDate | graduationRank";
            case 2:
                s += " | majors | university | semeter";
        }
        return s;
    }
}
