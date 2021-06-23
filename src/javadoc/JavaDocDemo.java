
package javadoc;

/**
 * @author shrikant sonawane
 * @version 1.0
 * @since June 2021
 */
public class JavaDocDemo {

    int a,b;

    /**
     * empty constructor
     */
    public JavaDocDemo() {
    }

    /**
     * parameterized constructor
     * @param a param 1
     * @param b param 2
     */
    public JavaDocDemo(int a, int b) {
        this.a=a;
        this.b=b;
    }

    /**
     * @return sum of a and b
     */
    public int add(){
        return (a+b);
    }

    /**
     * main method an entry point of code execution
     * @param args
     */
    public static void main(String[] args){
        JavaDocDemo jd = new JavaDocDemo(10,20);
        System.out.println("Sum = "+jd.add());
    }
}
