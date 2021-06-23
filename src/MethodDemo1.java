
class box
{
    int width;
    int height;
    int length;
    int volume;
    void volume(int height, int length, int width)
    {
        volume = this.width * this.height * this.length;
    }
}

public class MethodDemo1 {

    public static void main(String args[])
    {
        box obj = new box();
        //obj.height = 1;
        //obj.length = 5;
        //obj.width = 5;
        obj.volume(3,2,1);
        System.out.println(obj.volume);
    }

}


/*class Prameterized_method
{

}
*/