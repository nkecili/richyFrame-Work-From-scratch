package PageClasses;

import common.WebApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static PageClasses.HomePageWebElement.*;

public class HomePageClass extends WebApi {

    @FindBy (how = How.CSS, using = logoCss )
     public static  WebElement logo ;



    public static String getHomePageTitle(){
       return  driver.getTitle();
    }

    public static boolean  getLogo(){
      return   logo.isDisplayed();
    }





}
