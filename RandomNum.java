import java.util.Random;
public class RandomNum {
    public static void main(String[] args){
        Random random=new Random();
        
        System.out.println(random.nextInt(1,7));//prints number between 1 and 7-1=6 so between 1 and 6
        
    }
}
