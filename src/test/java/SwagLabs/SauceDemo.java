package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SauceDemo {
    WebDriver driver;
    @Test(priority=1)
    void OpenApp()
    {
    	driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/") ;
    }
    @Test(priority=2)
    void Login()
    {
       driver.findElement(By.name("user-name")).sendKeys("standard_user");
 	   driver.findElement(By.name("password")).sendKeys("secret_sauce");
 	   driver.findElement(By.name("login-button")).click();
    }
    @Test(priority=3)
    void Search()
    {
    	System.out.println("This is Search");
    }
    @Test(priority=4)
    void AddtoCart()
    {
    	driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
    	driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
    }
    @Test(priority=5)
    void GoToCart()
    {
    	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }
    @Test(priority=6)
    void CheckOut()
    {
    	driver.findElement(By.name("checkout")).click();
    }
    @Test(priority=7)
    void CheckOutInformation()
    {
    	driver.findElement(By.name("firstName")).sendKeys("Ramya");
    	driver.findElement(By.name("lastName")).sendKeys("Etla");
    	driver.findElement(By.name("postalCode")).sendKeys("500096");
}
    @Test(priority=8)
    void Continue()
    {
    	driver.findElement(By.name("continue")).click();
}
    @Test(priority=9)
    void Finish()
    {
    	driver.findElement(By.name("finish")).click();
}
    @Test(priority=10)
    void BackHome()
    {
    	driver.findElement(By.name("back-to-products")).click();
}
  @Test(priority=11)
  void Logout() throws InterruptedException
  {
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(2000);
      driver.findElement(By.id("logout_sidebar_link")).click();
  }
  @Test(priority=12)
  void CloseApp()
  {
	  driver.close();
  }
  

}
