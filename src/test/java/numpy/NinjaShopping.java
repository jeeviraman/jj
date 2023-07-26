package numpy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NinjaShopping {
	
	@Test
	public  void ninja() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		WebElement cursor=driver.findElement(By.id("form-currency"));
		cursor.click();
		
		WebElement euro=driver.findElement(By.xpath("//button[@class='currency-select btn btn-link btn-block'and @name='EUR']"));
		euro.click();
		Thread.sleep(10000);
		
		WebElement canon=driver.findElement(By.xpath("//a[text()='Canon EOS 5D']"));
		canon.click();
		//Thread.sleep(10000);
		WebElement bug=driver.findElement(By.id("input-option226"));
		Select bugs=new Select(bug);
		bugs.getOptions().size();
		if(bugs.getOptions().size()<2) {
			System.out.println("No select options avaialble");
		}
	    WebElement homescreen=driver.findElement(By.xpath("//a[text()='Your Store']"));
	    homescreen.click();
	    
	    WebElement iphone=driver.findElement(By.xpath("//a[text()='iPhone']"));
	    iphone.click();
	    WebElement quantity=driver.findElement(By.id("input-quantity"));
	    quantity.clear();
	    quantity.sendKeys("2");
	    
	    WebElement addtocart=driver.findElement(By.id("button-cart"));
	    addtocart.click();
	    System.out.println("Items sucessfully added to cart");
	    
	    WebElement shoppingcart=driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
	    shoppingcart.click();
	    
	    WebElement viewcart=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]"));
	    viewcart.click();
	    Thread.sleep(3000);
	   
	    WebElement iphonqty=driver.findElement(By.xpath("//button[@class='form-control'and@name=quantity[151162]"));
	    iphonqty.clear();
	    iphonqty.sendKeys("3");
	    Thread.sleep(3000);
	    
	    WebElement update=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]"));
	    update.click();
	
	    WebElement Ecotax=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[2]/td[1]/strong"));
	    System.out.println(Ecotax.getText());
	    
	    WebElement Vat=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[3]/td[1]/strong"));
	    System.out.println(Vat.getText());
	    
	    WebElement Checkout=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a"));
	    Checkout.click();
	    
	    WebElement productmsg=driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[1]/text()"));
	    		
	    	System.out.println(productmsg.getText());	
	    	
	    WebElement remove=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]"));
		remove.click();
		
		 WebElement yourstore=driver.findElement(By.xpath("//a[text()='Your Store']"));
		    yourstore.click();
		    
		    WebElement Macbook=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a"));
		    Macbook.click();
		    
		    WebElement defaultqty=driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"));
		    If(defaultqty.getText()=="1")
		    {
		    	System.out.println("default quantity equals1");
		    
		defaultqty.click();
		    
		    WebElement addcart=driver.findElement(By.className("btn btn-primary btn-lg btn-block"));
		    addcart.click();
            
		    WebElement successmsg=driver.findElement(By.className("alert alert-success alert-dismissible"));
		    
		    
	}
		    
	
	}	
}
