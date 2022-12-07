package week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mirudula");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mirudula");
		Thread.sleep(2000);
		driver.findElement(By.name("departmentName")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("midhu.kumar14@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		

	}

}
