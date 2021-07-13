package helpers;

import PageClasses.HomePageClass;
import common.WebApi;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;
import policyTest.base.Config;

import java.io.IOException;

public class SetUp extends WebApi {

   public static  HomePageClass homePageClass;

   public static void init(){
       homePageClass = PageFactory.initElements(driver,HomePageClass.class);
   }

   @Before
    public void setUpInit() throws IOException {
      Config con =  new Config();
      con.loadProperties();
      init();
   }
    @After
    public void tearDown(Scenario scenario) throws IOException {
       screenShot(scenario);
       SetUp.driver.quit();

    }




}
