
class Outer{
    int x=10;

    class Inner{
        int y=20;
        void show(){
            System.out.println("Inner show");
            System.out.println("outer x : "+x);
            //System.out.println("y : "+y);
        }
    }
    void show(){
        System.out.println("Outer show");
        Inner i = new Inner();
        i.show();
        System.out.println("inner y : "+i.y);
    }
}

public class InnerClassDemo1 {
    public static void main(String args[]){
        Outer o = new Outer();
        o.show();

        Outer.Inner i = new Outer().new Inner();
    }
}
