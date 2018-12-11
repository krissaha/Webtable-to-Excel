package com.qa.webtbltoexcel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/stocks/marketstats/fii_dii_activity/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Element = driver.findElement(By.xpath("//*[@id='mc_content']/section/section/div[1]/div[2]/h2[1]"));
		js.executeScript("arguments[0].scrollIntoView();",Element);
		// Xpath retrive		
		String beforexpath_date = "//*[@id='mc_content']/section/section/div[1]/div[2]/div[1]/table/tbody/tr[";
		String afterxpath_date =  "]/td[1]/a";
		
		String beforexpath_GrossPurchase = "//*[@id='mc_content']/section/section/div[1]/div[2]/div[1]/table/tbody/tr[";
		String afterxpath_GrossPurchase = 	"]/td[2]";
				
		String beforexpath_GrossSales = "//*[@id='mc_content']/section/section/div[1]/div[2]/div[1]/table/tbody/tr[";
		String afterxpath_GrossSales =	"]/td[3]";
		
		String beforexpath_Sales = "//*[@id='mc_content']/section/section/div[1]/div[2]/div[1]/table/tbody/tr[";
		String afterxpath_Sales = "]/td[4]/span";
		
		String beforexpath_Purchase = "//*[@id='mc_content']/section/section/div[1]/div[2]/div[1]/table/tbody/tr[";
		String afterxpath_Purchase = "]/td[5]";
		
		String beforexpath_GrossSale1 = "//*[@id='mc_content']/section/section/div[1]/div[2]/div[1]/table/tbody/tr[";
		String afterxpath_GrossSale1 = "]/td[6]";
		
		String beforexpath_NetPurchase = "//*[@id='mc_content']/section/section/div[1]/div[2]/div[1]/table/tbody/tr[";
		String afterxpath_NetPurchase = "]/td[7]/span";
		
			
		// loop for printing the data				
		for (int i = 1; i<= 6; i++){
		
			String actualxpath_date = beforexpath_date + i + afterxpath_date;	
			String Date = driver.findElement(By.xpath(actualxpath_date)).getText();
			System.out.print(Date +" ");
			
			String actualxpath_GrossPurchase = beforexpath_GrossPurchase + i + afterxpath_GrossPurchase;	
			String GrossPurchase = driver.findElement(By.xpath(actualxpath_GrossPurchase)).getText();
			System.out.print(GrossPurchase +" ");
			
			String actualxpath_GrossSales = beforexpath_GrossSales + i + afterxpath_GrossSales;	
			String GrossSales = driver.findElement(By.xpath(actualxpath_GrossSales)).getText();
			System.out.print(GrossSales +" ");
			
			String actualxpath_Sales = beforexpath_Sales + i + afterxpath_Sales;	
			String Sale = driver.findElement(By.xpath(actualxpath_Sales)).getText();
			System.out.print(Sale +" ");
			
			String actualxpath_Purchase = beforexpath_Purchase + i + afterxpath_Purchase;	
			String Purchase = driver.findElement(By.xpath(actualxpath_Purchase)).getText();
			System.out.print(Purchase +" ");
			
			String actualxpath_GrossSale1 = beforexpath_GrossSale1 + i + afterxpath_GrossSale1;	
			String Sale1 = driver.findElement(By.xpath(actualxpath_GrossSale1)).getText();
			System.out.print(Sale1 +" ");
			
			String actualxpath_NetPurchase = beforexpath_NetPurchase + i + afterxpath_NetPurchase;	
			String Purchase1 = driver.findElement(By.xpath(actualxpath_NetPurchase)).getText();
			System.out.println(Purchase1);
					
		}
		driver.close();
	}
}
