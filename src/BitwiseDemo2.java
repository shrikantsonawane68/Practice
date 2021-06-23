public class BitwiseDemo2 {

    public static void main(String args[])
    {
        //storing 2 variables in single byte variable

        byte a = 9, b = 12;
        byte c;

        c=(byte)(a<<4); // storing a in first 4 bits of c by doing left shift
        c=(byte)(c|b); // storing b in last 4 bits of c by doing bitwise or

        System.out.println((c&0b11110000)>>4); // reading only first 4 bits in c
        System.out.println((c&0b00001111)); // reading only last 4 bits in c

    }
}
