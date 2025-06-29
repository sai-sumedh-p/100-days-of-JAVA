import java.util.Scanner;
public class Strings{
    public  static void main(String[] args){
            String firstname;
            String lastname;
            Scanner scanner=new Scanner(System.in);
            String name;
            System.out.println("Enter your first name");
            firstname = scanner.nextLine();
             System.out.println("Enter your last name");
            lastname = scanner.nextLine()+" ";
            name=firstname.concat( lastname);
            System.out.println("Your name is: " + name.toUpperCase() ); //makes the name to upper case letters
            System.out.println("Your name is: " + name.toLowerCase() ); //makes the name to lower case letters
            System.out.println("The length of your name is: "+name.length()+" characters");
            System.out.println("Your name is: " + name.toUpperCase() ); //makes the name to upper case letters
            System.out.println("Your name is: " + name.toLowerCase() ); //makes the name to lower case letters
            System.out.println("what do you want to find in your Name");
            String txt=scanner.nextLine();
            System.out.println(txt+" starts at "+name.indexOf(txt)+" character");




            scanner.close();
    }
}