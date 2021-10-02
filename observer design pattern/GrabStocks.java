/**
 * Demo implememntaion for observer desgin pattern
 * code reference: http://www.newthinktank.com/2012/08/observer-design-pattern-tutorial/ 
 */
public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber  stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(200.00);
        stockGrabber.setGooglePrice(101.00);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(200.00);
        stockGrabber.setGooglePrice(101.00);

        stockGrabber.unregister(observer1);
        stockGrabber.unregister(observer2);

    }
}
