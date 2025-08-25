package SeleniumMocuk_Project_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumProjects {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://d3pv22lioo8876.cloudfront.net/tiptop/");
	WebElement disabled=	driver.findElement(By.xpath("//input[@name='my-disabled']"));
	System.out.println("1. Verify that the text input element with xpath .//input[@name='my-disabled'] is disabled in the form: "+disabled.isEnabled());

	WebElement readonlyxpath1=driver.findElement(By.xpath("//input[@name='my-readonly']"));
WebElement readonlyxpath2=	driver.findElement(By.name("my-readonly"));
System.out.println("2. Verify that the text input with value 'Readonly input' is in readonly state by using 1 xpaths: " +readonlyxpath1.getDomAttribute("name"));
System.out.println("2. Verify that the text input with value 'Readonly input' is in readonly state by using 1 xpaths: " +readonlyxpath2.getDomAttribute("name"));
	//3. Verify that the dropdown field to select color is having 8 elements using 2 xpaths
WebElement dropdown1=driver.findElement(By.xpath("//select[@name='my-select']"));
WebElement dropdown2=driver.findElement(By.cssSelector("select[name='my-select']"));
Select s1=new Select(dropdown1);
Select s2= new Select(dropdown2);
List<WebElement> drop1=s1.getOptions();
List<WebElement> drop2=s2.getOptions();
System.out.println("3. Verify that the dropdown field to select color is having 8 elements using 1 xpaths: "+drop1.size());
System.out.println("3. Verify that the dropdown field to select color is having 8 elements using 2 xpaths: "+drop2.size());

//4. Verify that the submit button is disabled when no data is entered in Name field
WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
System.out.println("4. Verify that the submit button is disabled when no data is entered in Name field: "+button.isDisplayed());

//5. Verify that the submit button enabled when both Name and Password field is entered
driver.findElement(By.xpath("//input[@name='my-name']")).sendKeys("Parameswari");
driver.findElement(By.xpath("//input[@name='my-password']")).sendKeys("Test@1234");
WebElement button1=driver.findElement(By.xpath("//button[@type='submit']"));
System.out.println("5. Verify that the submit button enabled when both Name and Password field is entered: "+button1.isDisplayed());
	//6. Verify that on submit of 'Submit' button the page shows 'Received' text
button1.click();
Thread.sleep(600);
WebElement received=driver.findElement(By.xpath("//p[@id='message']"));
System.out.println("6. Verify that on submit of 'Submit' button the page shows 'Received' text: "+received.getText()+"and is enabled"+received.isDisplayed());
//7. Verify that on submit of form all the data passed to the URL
String currenturl=driver.getCurrentUrl();
System.out.println("submitted URL: "+currenturl);
	
	}

}
