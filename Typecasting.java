/*Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte */

public class Typecasting {
    public static void main(String[] args){
        //widening casting is done automatically
        int num=69;
        float num1=num;
        System.out.println(num1); 

        //narrowing casting is done manually 
        float CGPA=9.14f;
        int cgpa=(int)CGPA;
        System.out.println(cgpa);
    }
}
