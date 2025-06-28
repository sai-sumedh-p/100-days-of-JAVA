import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("which number's multiplication table do you want ?");
        int num=input.nextInt();
        input.close();
        
        for(int i=1;i<=10;i++){
            System.out.println(num+" X"+" "+i+" = "+num*i);
        }
        
        


    }
}
