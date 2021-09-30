
public class Major {
    private static final Major major = new Major();

    private Major(){
    }

    public static  Major getInstance(){
        return major;
    }

    @Override 
    public String toString(){
        return "Computer Science";
    }
}
