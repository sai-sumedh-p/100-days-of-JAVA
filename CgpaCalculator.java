import java.util.Scanner;
public class CgpaCalculator {

    public static void main(String[] args){
            System.out.println("enter your name");
            Scanner input=new Scanner(System.in);
            String name = input.nextLine();
            System.out.println("enter your age");
            int age = input.nextInt();
            input.nextLine();// Consume the newline character
            System.out.println("enter your course");
            String course = input.nextLine();
            System.out.println("enter your branch");
            String branch =input.nextLine();
            System.out.println("which year are you studying in");
            int yearOfStudy =input.nextInt();
            System.out.println("which semester are you studying in");
            int sem =input.nextInt();

            double[] sgpas = new double[sem];
            double total = 0;

            for (int i = 0; i < sem-1; i++) {
                    System.out.print("Enter SGPA for Semester " + (i + 1) + ": ");
                    sgpas[i] = input.nextDouble();

                    // Validate SGPA input (usually between 0 and 10)
                    if (sgpas[i] < 0 || sgpas[i] > 10) {
                            System.out.println("Invalid SGPA! Please enter a value between 0 and 10.");
                            i--; // repeat current semester input
                            continue;
                    }

                    total += sgpas[i];
            }

            double cgpa = total / (sem-1);
            System.out.printf("Your CGPA is: %.2f\n", cgpa);

            // Optional: Convert CGPA to percentage
            double percentage = (cgpa - 0.75) * 10;
            System.out.printf("Equivalent Percentage: %.2f%%\n", percentage);

            input.close();
            System.out.println("you are : "+name);
            System.out.println("you are a "+age+" years old"+" "+course+" student of "+yearOfStudy+" year "+"studying in "+branch+" branch");

            if(cgpa>=9){
                   System.out.println("you are an outstanding student with a CGPA of: "+cgpa);

           } else if (cgpa>=8) {
                   System.out.println("you are good student with a CGPA of: "+cgpa);
           }else {
            System.out.println(" You need to perform better in your next semester ");
           }
    }
}