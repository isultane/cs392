

/**
 * This is demo on how to use JUnit testing
 * @author Sultan S. Alqahtani
 * @version 1.0
 * Date: 13-09-2021
 */
public class Calculator{
    public static void main(String[] args) {
        int a = 50;
        int b = 60;

        int c = Max(a, b);

        System.out.println("Max of a and b = "+ c);
    }

    /**
     * 
     * @param x
     * @param y
     * @return the max between two intergers values
     */
    public static int Max(int x, int y){
       if(x > y){
           return x;
       }
       else{
           return y;
       }
    }

}