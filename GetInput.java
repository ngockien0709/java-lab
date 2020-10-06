
import java.util.Scanner;

public class GetInput{
    
    Scanner sc = new Scanner(System.in);
    
    public  double getInput(){
        
        while(true){
            try{
                double d = Double.parseDouble(sc.nextLine());
                if(d>0){
                    return d;
                }else{
                    System.out.println("input number must be positive");
                    System.out.print("please re-input: ");
                }
            }catch(Exception e){
                System.out.println("please input number");
                System.out.println("please re-input: ");
            }  
        }
        
        
    }
    
    public  Rectangle getInputRectangle(){
        System.out.println("please input side width of rectangle: ");
        double width = getInput();
        System.out.println("please input side lengtf of rectangle: ");
        double length = getInput();
        return new Rectangle(width, length);
    }
    
    public Circle getInputCircle(){
        System.out.println("please input radius of Circle: ");
        double radius = getInput();
        return new Circle(radius);        
    }
    
    public Triangle getInputTriangle(){
        System.out.println("please input side A : ");
        double sideA = getInput();
        System.out.println("please input side B: ");
        double sideB = getInput();
        System.out.println("please input side c: ");
        double sideC = getInput();
        return new Triangle(sideA, sideB, sideC);
    }
    
    
    
}