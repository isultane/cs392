import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**This class is used for measurements 
 * @author Sutlan S. Alqahntai
 * @version 1.0
 */
public class Measure{
    public static void main(String[] args) {
        int a = 50;
        int b = 60;

        int c = Max(a, b);

        System.out.println("Max of a and b = "+ c);
    }

    /**
     * This method compatre between two values and return the maximum one. 
     * @param x
     * @param y
     * @return x or y the maximum
     */
    public static int Max(int x, int y){
       if( x > y){
           return x;
       }
       else{
           return y;
       }

    }
    @Test
    public  void testMax() {
        assertEquals(200, Max(100, 200));
        assertEquals(200, Max(100, 200));
        assertEquals(100, Max(100, 100));
    }
}