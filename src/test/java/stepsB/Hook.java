package stepsB;
import org.openqa.selenium.WebDriver;

public class Hook {

        WebDriver driver = null;
        public void setUp(){
            System.out.println("Before Method");
        }

        public void cleanUp(){
            driver.quit();
            System.out.println("After Method");
        }
    }

