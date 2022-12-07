package week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FirstnameBrowsertitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Mirudula");
		driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
		driver.findElement(By.className("smallSubmit")).click();
		
		//To get the First Name		
		WebElement code=driver.findElement(By.id("viewContact_firstName_sp"));
		String s=code.getText();
		System.out.println("FirstName:"+ s);
		
		//To get the Title 	
		String title=driver.getTitle();
		System.out.println("Brower Title:" + title);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
