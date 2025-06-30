
import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length of side A");
        double a=scanner.nextFloat();
        System.out.println("enter the length of side B");
        double b=scanner.nextFloat();
        scanner.close();
        double hyp=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Hypotenuse is"+hyp);
    }
}
