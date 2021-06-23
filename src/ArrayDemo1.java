public class ArrayDemo1 {

    public static void main(String args[]){
        //find second largest number in array

        int a[]={2,17,3,8,15,9,7,1,16,10};

        int max1 = a[0];
        int max2 = a[0];

        for (int i=0;i<a.length;i++){
            if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.print("Array elements : ");
        for(int x:a){
            System.out.print(x+", ");
        }
        System.out.println("\n First largest number in array is : "+max1);
        System.out.println("Second largest number in array is : "+max2);
    }
}
