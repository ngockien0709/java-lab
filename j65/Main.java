/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j65;

import static j65.GetInput.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nguye
 */
public class Main {
    public static void createStudent(List<Student> s){
        while(true){
            System.out.print("name: ");
            String name = GetInput.getInputString();
            
            System.out.print("class: ");
            String classes = GetInput.getInputString();
            
//            System.out.println("math: ");
            double math = GetInput.getMark("Math: ");
            
//            System.out.println("physical: ");
            double physical = GetInput.getMark("physical");
            
            double chemistry = GetInput.getMark("chemistry: ");
            
            double average = (math+physical+chemistry)/3;
            char type = GetInput.Type(average);
            
            s.add(new Student(name, classes, math, physical, chemistry, average, type));
            System.out.println("add more???");
            if(GetInput.checkUserChoose()==false){
                return;
            }
        }
    }
    
    public static HashMap<String,Double> getPercentTypeStudent(List<Student> s){
       HashMap<String,Double> getPercentTypeStudent = new HashMap<>();
       int totalStudent = s.size();
       double typeA =0;
       double typeB =0;
       double typeC =0;
       double typeD =0;
       
        for (int i = 0; i < totalStudent; i++) {
            if(s.get(i).getType() == 'A'){
                typeA++;
            }
            if(s.get(i).getType() == 'B'){
                typeB++;
            }
            if(s.get(i).getType() == 'C'){
                typeC++;
            }
            if(s.get(i).getType() == 'D'){
                typeD++;
            }
        }
        
        getPercentTypeStudent.put("A", typeA/totalStudent*100);
        getPercentTypeStudent.put("B", typeB/totalStudent*100);
        getPercentTypeStudent.put("C", typeC/totalStudent*100);
        getPercentTypeStudent.put("D", typeD/totalStudent*100);
        return getPercentTypeStudent;
    }
    
    public static void displayInforStudent(List<Student> l){
        int i=0;
        for (Student s : l) {
            System.out.println("Student "+(++i)+"info");
            System.out.println("Name: "+s.getName());
            System.out.println("Class: "+s.getClassName());
            System.out.println("Avg: "+s.getAverage());
            System.out.println("Type: "+s.getType());
        }
    }
    
    
    public static void display(){
        List<Student> s = new ArrayList<>();
        createStudent(s);
        displayInforStudent(s);
        HashMap<String,Double> getPercentType = getPercentTypeStudent(s);
        for (Map.Entry Student : getPercentType.entrySet()) {
            System.out.println(Student.getKey()+" : "+Student.getValue()+"%");
        }
        
    }
    
    public static void main(String[] args) {
        display();
    }
}
