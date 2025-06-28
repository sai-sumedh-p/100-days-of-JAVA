import java.util.Scanner;
public class MarksStoring {
    public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("how many students's marks do you want to enter ?");
            int num=scanner.nextInt();
            scanner.nextLine();
            float[] marks= new float[num];
            System.out.println("enter the marks one followed by the other");
            for(int i=0;i<num;i++){
                marks[i]=scanner.nextFloat();
            }

            scanner.close();
            System.out.println("successfully stored the marks");
            for(int i=0;i<num;i++){
                System.out.println(marks[i]);
            }
    }
}
