public class OrderInformation {
    private String order_info;
    private int gift_id;
    private int receipt_num;

    // Setters
    public void setGiftCardID(int gift_id){
        this.gift_id = gift_id;
    }
    public void setOrderInformaion(String order_info){
        this.order_info = order_info;
    }
    public void setReceiptInformation(int rececipt_num){
        this.receipt_num = rececipt_num;
    }

    // Getters
    public int getGiftCardID(){
        return this.gift_id;
    }
    public String getOrderInformaion(){
        return this.order_info;
    }

    public int getReceiptInformation(){
        return this.receipt_num;
    }
}
