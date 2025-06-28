import java.util.Scanner;
public class Strings{
    public  static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            String name;
            System.out.println("Enter your name");
            name = scanner.nextLine();
            scanner.close();
            System.out.println("The length of your name is: "+name.length()+" characters");

    }
}