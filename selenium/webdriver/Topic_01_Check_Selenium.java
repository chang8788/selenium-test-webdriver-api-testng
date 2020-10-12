package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Topic_01_Check_Selenium {
 // Khai bao bien dai dien Selenium Driver
 WebDriver driver;
 @BeforeClass
  public void beforeClass() {
	 // Pre - Condition
	 //Mo trinh duyet len
	 driver = new FirefoxDriver();
	  
	//Mo app can test len
	 driver.get("https://www.facebook.com/");
  }
	
  @Test
  public void TC_01_Check_Title() {
	  String homePageTitle = driver.getTitle();
	  
	  Assert.assertEquals(homePageTitle, "Facebook - Đăng nhập hoặc đăng ký");
  }
  @Test
  public void TC_02_Check_Url() {
	  String homePageUrl = driver.getCurrentUrl();
	  Assert.assertEquals(homePageUrl, "https://www.facebook.com/");
  }
  
 //Post - Condition - Clean Data (Brownser
  @AfterClass
  public void afterClass() {
	  // Dong trinh duyet
	  driver.quit();
  }

}
