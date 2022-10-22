package GroupProject2;

public class Task4 {
    /*
    Provide Implementation for the diagram below.
    Then create a test class in which you need to create Objects of ChromeDriver,
    FirefoxDrive and SafariDriver classes and see which methods available to them.
     */
    public static void main(String[] args) {
        remoteWebDriver [] w ={new Chromedriver(),new FireFox(), new safariDriver()};
        for(remoteWebDriver rem: w){
            System.out.println();
            rem.open();
            rem.close();
            System.out.println(rem.getTitle());
            rem.navigate();
            // rem.getScreenshot(); not available
        }
    }

}
interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface remoteWebDriver extends WebDriver{
    void navigate();
}
interface  takeScreenShot extends WebDriver{
    void getScreenshot();
}
class Chromedriver implements remoteWebDriver{

    @Override
    public void open() {
        System.out.println("opening the Chrome");
    }

    @Override
    public void close() {
        System.out.println("closing the Chrome");
    }

    @Override
    public String getTitle() {
        return "getting title from the chromebrowser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to url from Chromebrowser");
    }
}
class FireFox implements remoteWebDriver{
    @Override
    public void open() {
        System.out.println("opening the FireFox");
    }

    @Override
    public void close() {
        System.out.println("closing the FireFox");
    }

    @Override
    public String getTitle() {
        return "getting title from the FireFoxbrowser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to url from Chromebrowser");
    }
}

class safariDriver implements remoteWebDriver{
    @Override
    public void open() {
        System.out.println("opening the safari");
    }

    @Override
    public void close() {
        System.out.println("closing the safari");
    }

    @Override
    public String getTitle() {
        return "getting title from the safari browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to url from safaribrowser");
    }
}


