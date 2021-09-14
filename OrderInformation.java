
public class OrderInformation {
    private String customerName;
    private String drinkDescription;
    private int giftCardNumber;
    private int prefereedStoreNumber;

    public void setCustomerName(String name){
        customerName = name;
    }
    public void setDrinkDescription(String desc){
        drinkDescription = desc;
    }
    public void setGiftCardNumber(int gNum){
        giftCardNumber = gNum;
    }
    public void setPreferredStoreNumber(int num){
        prefereedStoreNumber = num;
    }

    public String getCustomerName(){
        return customerName;
    }
    public String getDrinkDescription(){
        return drinkDescription;
    }
    public int getGiftCardNumber(){
        return giftCardNumber;
    }
    public int getPreferredStoreNumber(){
        return prefereedStoreNumber;
    }

}
