
interface WebDriver{
    public void getElement();
    public void selectElement();
}

class ChromeDriver implements WebDriver{

    @Override
    public void getElement() {
        System.out.println("Get element from ChromeDriver");
        
    }

    @Override
    public void selectElement() {
        System.out.println("Select element form ChromeDriver");
        
    }
}

class IEDriver{
    public void findElement(){
        System.out.println("Find element from IEDriver");
    }

    public void clickElement(){
        System.out.println("Click element from IEDriver");
    }
}
class WebDriverAdapter implements WebDriver{
    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver ieDriver){
        this.ieDriver = ieDriver;
    }

    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    } 
    
}

public class WebDriverAdapterDPattern {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.getElement();
        chrome.selectElement();

        IEDriver ie = new IEDriver();
        ie.findElement();
        ie.clickElement();

        WebDriver driver = new WebDriverAdapter(ie);
        driver.getElement();
        driver.selectElement();

    }
}
