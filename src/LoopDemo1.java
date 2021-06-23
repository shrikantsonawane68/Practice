import java.util.Scanner;

public class LoopDemo1 {

    public static void main(String args[])
    {
        /*for (int i=0, j=0;i<=10 && j<=10;i++,j++){

            System.out.println(i+" "+j);
        }*/
       /* int sum = 0;
        for(int i=1; i<=10; i++){
            sum+=i;
            System.out.println(sum);
        }*/

       //reversing number

        int n, rem, rev;
        Scanner sc = new Scanner(System.in);
        rev = 0;
        System.out.println("Enter number : ");
        n = sc.nextInt();

        while(n>0)
        {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        System.out.println("Reverse number is : "+ rev);

    }
}
