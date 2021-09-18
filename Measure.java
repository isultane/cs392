import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class Measure{
    public static void main(String[] args) {
        int a = 50;
        int b = 60;

        int c = Max(a, b);

        System.out.println("Max of a and b = "+ c);
    }

    public static int Max(int x, int y){
       if(x > y){
           return x;
       }
       else{
           return y;
       }
    }

    @Test
    public void testMax(){
        assertEquals(6, Max(5,6));
        assertEquals(100, Max(100,80));
        assertEquals(5, Max(5,5));
    }


}