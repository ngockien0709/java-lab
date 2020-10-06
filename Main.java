
import java.util.ArrayList;

public class Main{
     
    public static ArrayList<Shape> getUserInput(ArrayList<Shape>a){
        GetInput g = new GetInput();
        a.add(g.getInputRectangle());
        a.add(g.getInputCircle());
        a.add(g.getInputTriangle());
        return a;
    }
    
    public static void display(ArrayList<Shape> a){
        a.get(0).printResult();
        a.get(1).printResult();
        a.get(2).printResult();
    }
    
    public static void main(String[] args) {
        ArrayList<Shape> a = new ArrayList<>();
        a = getUserInput(a);
        display(a);
                
    }
    
    
    
}