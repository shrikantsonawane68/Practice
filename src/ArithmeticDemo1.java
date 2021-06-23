import java.io.*;
public class ArithmeticDemo1 {

    public static void main(String args[])
    {
        /*int a = 10;
        char c = 'a';
        char s = (char) (a+c);
        System.out.println("Sum = "+s);
        System.out.println("character = "+c);*/

        //Bitwise

        /*int x=100;
        int y=6;
        int z = x&y;
        System.out.println("binary of x is  = "+ Integer.toBinaryString(x));
        System.out.println("binary of y is  = "+ Integer.toBinaryString(y));
        System.out.println("Bitwise And  x & y is  z = "+z);*/

        // Bitwise NOT ~

        int x = 15;
        int z = ~x; // -(x+1)

        int l = x<<1; //x*2 power 1 : here power changes as per the shift digit value  // if the power is 1 then value gets doubled
        int r = x>>1; //x/2 power 1 : here power changes as per the shift digit value  // if the power is 1 then value gets half
        System.out.println("Not x is = "+z);
        System.out.println("Left shift of  x is = "+l);
        System.out.println("Right shift of  x is = "+r);
    }
}
