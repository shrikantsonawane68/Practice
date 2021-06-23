import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayDemo2 {


    public static void main(String args[]) {
        //rotating array from left ro right // left rotation // shifting element to left by 1 place

        int a[]={0,1,2,3,4,5,6,7,8,9};

        int b[]=new int[]{1,2,3};


        System.out.print("\n Array elements before left rotating  : ");
        for(int x:a){
            System.out.print(x+" | ");
        }

        int temp = a[0];

        for(int i=1;i<a.length;i++){
            //a[i]=a[i+1];
            a[i-1]=a[i];
        }

        a[a.length-1] = temp;

        System.out.print("\n Array elements after left rotating  :  ");
        for(int x:a){
            System.out.print(x+" | ");
        }

        System.out.println(Arrays.toString(a));

    }
    }
