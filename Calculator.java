
public class Calculator{
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

}