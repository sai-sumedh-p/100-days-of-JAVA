import java.util.Scanner;
public class areacalculator {
    public static void main(String[] args){
        double length =0;
        double breadth=0;
        double area=0;
        Scanner areacalc=new Scanner(System.in);
        System.out.println("what is the length of the rectangle");
        length=areacalc.nextDouble();
        System.out.println("what is the breadth of the rectangle");
        breadth =areacalc.nextDouble();
        areacalc.close();
        area=length*breadth;
        System.out.println(".The Area of the rectangle is: "+area);
        
        


    }
}
