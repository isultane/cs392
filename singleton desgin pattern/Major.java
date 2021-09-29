
public class Major {
    private static Major major;
    

    private Major(String CS, String IS){
        this.majorCS = CS;
        this.majorIS = IS;
    }

    public static String getInstance(){
        return "";
    }
    @Override
    public String toString(){
        return "Major: "+this.majorCS+" "+this.majorIS;
    }
}
