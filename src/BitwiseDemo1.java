public class BitwiseDemo1 {

    public static void main(String args[]){
        //swapping 2 numbers without using third variable
        int a,b;
        a=10;
        b=15;

        System.out.println("Numbers before swapping a = "+ a +" and b = "+ b);

        //performing swapping using bitwise XOR operator
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("Numbers after swapping a = "+ a +" and b = "+ b);

    }
}
