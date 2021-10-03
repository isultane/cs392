import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;
    
    public StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver){
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver){
        int observersIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer: " + (observersIndex+1) + " deleted");

        observers.remove(observersIndex);
    }

    @Override
    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }

    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setApplePrice(double newApplePrice){
        this.applePrice = newApplePrice;
        notifyObserver();
    }

    public void setGooglePrice(double newGooglePrice){
        this.googlePrice = newGooglePrice;
        notifyObserver();
    }

}
