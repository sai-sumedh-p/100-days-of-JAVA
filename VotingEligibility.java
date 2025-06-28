import java.util.Scanner;
public class VotingEligibility{
    public static void main(String[] args){
        int age;
    int votingAge = 18;
    Scanner scanner=new Scanner(System.in);
    System.out.println("How old are you ? ");
    age=scanner.nextInt();
    scanner.close();
    
    if (age >= votingAge) {
      System.out.println("Old enough to vote!");
    } else {
      System.out.println("Not old enough to vote.");
    }  
    }
}