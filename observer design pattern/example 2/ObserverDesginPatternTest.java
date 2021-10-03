import java.util.ArrayList;
import java.util.List;

interface Subject{
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
}

class DeliveryData implements Subject{
    private List<Observer> observers;
    private String location; 

    public DeliveryData(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
       observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(Observer obj : observers){
            obj.update(location);
        }
    }

    // you can have here any somthing (subject) has changed and you want to notify observers about it
    public void locationChanged(){
        this.location = getLocation();
        notifyObservers();
    }

    public String getLocation(){
        return "YPlace";
    }
}

interface Observer{
    public void update(String location);
}

class Seller implements Observer{

    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }
    
    public void showLocation(){
        System.out.println("Notifcation at Seller - current location: "+ location);
    }
}

class User implements Observer{

    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }
    
    public void showLocation(){
        System.out.println("Notifcation at User - current location: "+ location);
    }
}

class DeliveryWarehuseCenter implements Observer{

    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }
    
    public void showLocation(){
        System.out.println("Notifcation at warehouse - current location: "+ location);
    }
}


public class ObserverDesginPatternTest {
    public static void main(String[] args) {
        DeliveryData topic = new DeliveryData();

        Observer observer1 = new Seller();
        Observer observer2 = new User();
        Observer observer3 = new DeliveryWarehuseCenter();

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        topic.locationChanged();
    }
}
